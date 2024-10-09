package com.yagicamp;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(15, Calculator.add(10, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, Calculator.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, Calculator.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(10, 5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator.divide(10, 0);
    }

}
