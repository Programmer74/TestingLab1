package testing.lab1;

import org.junit.Test;
import testing.lab1.util.Pair;

import java.util.logging.Logger;

import static java.lang.Math.PI;

import static org.junit.Assert.assertTrue;

import static testing.lab1.Calculator.sin;

public class CalculatorTest {
    Logger log = Logger.getLogger(CalculatorTest.class.getName());

    @Test
    public void bordersTest() {
        for (Double x = -10*PI; x < 10*PI; x += 0.01) {
            double sinValue = sin(x);
            assertTrue("sin(" + x + "): " + sinValue + " <= 1 && " +
                            sinValue + " >= -1",
                    sinValue <= 1 && sinValue >= -1);
        }
    }

    private static class DDPair extends Pair<Double, Double> {
        DDPair(Double key, Double value) {
            super(key, value);
        }
    }

    @Test
    public void halfPeriodTest() {
        DDPair values[] = new DDPair[] {
                new DDPair(sin(-2   * PI), 0d),
                new DDPair(sin(-1.5 * PI), 1d),
                new DDPair(sin(-1   * PI), 0d),
                new DDPair(sin(-0.5 * PI), -1d),
                new DDPair(sin(0    * PI), 0d),
                new DDPair(sin(0.5  * PI), 1d),
                new DDPair(sin(1    * PI), 0d),
                new DDPair(sin(1.5  * PI), -1d),
                new DDPair(sin(2    * PI), 0d),
        };
        for (int i = 0; i < values.length; ++i) {
            assertTrue("Element " + i + ": " + values[i].getKey(),
                    Math.abs(values[i].getKey() - values[i].getValue()) < 1e-6);
        }
    }

}
