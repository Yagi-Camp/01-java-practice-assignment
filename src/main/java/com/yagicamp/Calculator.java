package com.yagicamp;

public class Calculator {

    public static void main(String[] args) {
        // TODO: Implement the logic for calculator
    }

    // Method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
