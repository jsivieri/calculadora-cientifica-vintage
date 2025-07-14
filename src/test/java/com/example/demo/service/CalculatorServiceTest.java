package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void testBasicOperations() {
        assertEquals(8.0, calculatorService.add(5, 3));
        assertEquals(2.0, calculatorService.subtract(5, 3));
        assertEquals(15.0, calculatorService.multiply(5, 3));
        assertEquals(2.5, calculatorService.divide(5, 2));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculatorService.divide(5, 0);
        });
    }

    @Test
    void testScientificOperations() {
        assertEquals(25.0, calculatorService.power(5, 2));
        assertEquals(4.0, calculatorService.sqrt(16));
        assertEquals(Math.sin(Math.toRadians(30)), calculatorService.sin(30), 0.0001);
        assertEquals(Math.cos(Math.toRadians(0)), calculatorService.cos(0), 0.0001);
        assertEquals(1.0, calculatorService.log(10), 0.0001);
    }

    @Test
    void testFactorial() {
        assertEquals(1.0, calculatorService.factorial(0));
        assertEquals(1.0, calculatorService.factorial(1));
        assertEquals(24.0, calculatorService.factorial(4));
        assertEquals(120.0, calculatorService.factorial(5));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(ArithmeticException.class, () -> {
            calculatorService.factorial(-1);
        });
    }

    @Test
    void testPercentage() {
        assertEquals(20.0, calculatorService.percentage(100, 20));
        assertEquals(15.0, calculatorService.percentage(50, 30));
    }

    @Test
    void testAbsoluteValue() {
        assertEquals(5.0, calculatorService.abs(-5));
        assertEquals(3.14, calculatorService.abs(3.14));
        assertEquals(0.0, calculatorService.abs(0));
    }

    @Test
    void testSqrtNegative() {
        assertThrows(ArithmeticException.class, () -> {
            calculatorService.sqrt(-4);
        });
    }

    @Test
    void testLogarithmNonPositive() {
        assertThrows(ArithmeticException.class, () -> {
            calculatorService.log(0);
        });
        
        assertThrows(ArithmeticException.class, () -> {
            calculatorService.ln(-1);
        });
    }
}
