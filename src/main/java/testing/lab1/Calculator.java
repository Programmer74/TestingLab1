package testing.lab1;

public class Calculator {

    private static double summand(double x, int k) {
        double rc = 1;
        for (int i = 1; i <= k; ++i) {
            rc *= x/i;
        }
        return rc;
    }

    public static double sin(double x) {
        int precision = 100;
        double rc = 0;
        for (int i = 0; i < precision; ++i) {
            rc += (i % 2 == 0 ? 1 : -1) * summand(x, 2*i + 1);
        }
        return ((int)(rc * 1e5)) / 1e5;
    }

    public static double sin_degrees(double x, int precision) {
        return sin(x * Math.PI / 180);
    }
}
