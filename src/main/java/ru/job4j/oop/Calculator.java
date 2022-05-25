package ru.job4j.oop;

import java.util.concurrent.Callable;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int c) {
        return c - x;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int e) {
        return sum(e) + multiply(e) + minus(e) + divide(e);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);

        result = minus(35);
        System.out.println(result);

        rsl = calculator.divide(24);
        System.out.println(rsl);

        rsl = calculator.sumAllOperation(25);
        System.out.println(rsl);
    }
}
