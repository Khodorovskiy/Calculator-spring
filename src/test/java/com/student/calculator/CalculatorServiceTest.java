package com.student.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();
    @Test
    void testAdd(){
        assertEquals(5, calculatorService.add(2, 3));
        assertEquals(-1, calculatorService.add(-4, 3));
    }
    @Test
    void testSubtract(){
        assertEquals(2, calculatorService.subtract(5, 3));
        assertEquals(-9, calculatorService.subtract(1, 10));
    }
    @Test
    void testMultiply(){
        assertEquals(20, calculatorService.multiply(4, 5));
    }
    @Test
    void testDivide(){
        assertEquals(2, calculatorService.divide(10, 5));
    }
    @Test
    void testDivideByZeroThrowsException(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divide(10, 0);
        });
    }
}
