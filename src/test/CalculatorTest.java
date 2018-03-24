package test;

import main.Calculator;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testFactorial() {
        double y1 = 120;
        double y2 = Calculator.factorial(5);
        assertEquals(y1, y2, 0.00001);
    }

    @Test
    public void testDegrees() {
        double y1 = 1;
        double y2 = Calculator.sin_degrees(90, 5);
        assertEquals(y1, y2, 0.1);
    }

    @Test
    public void testRadians() {
        double y1 = 1;
        double y2 = Calculator.sin(3.14 / 2, 5);
        assertEquals(y1, y2, 0.1);
    }
}
