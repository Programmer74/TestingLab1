package main;

public class Calculator {

    public static double factorial(int x) {
        long ans = 1;
        for (int i = 1; i <= x; i++) {
            ans = ans * i;
        }
        return ans;
    }

    public static double sin(double x, int precision) {
        double ans = 0;
        for (int i = 0; i < precision; i++) {
            ans += Math.pow(-1, i) * (Math.pow(x, (2 * i + 1))) / factorial(2 * i + 1);
        }
        return ans;
    }

    public static double sin_degrees(double x, int precision) {
        return sin(x * Math.PI / 180, precision);
    }
}
