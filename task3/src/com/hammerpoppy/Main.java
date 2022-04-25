package com.hammerpoppy;

public class Main {

    public static void main(String[] args) {
        double x = 2, n = 1;
        double result = x;

        for (int i = 1; i <= n; i++) {
            result += (Math.pow(-1, n) * Math.pow(x, 2 * n + 1)) / getFactorial((int) (2 * n + 1));
        }

        System.out.println(result);
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
