package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    // Operações básicas
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    // Operações científicas
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double sqrt(double value) {
        if (value < 0) {
            throw new ArithmeticException("Raiz quadrada de número negativo não é permitida");
        }
        return Math.sqrt(value);
    }

    public double sin(double value) {
        return Math.sin(Math.toRadians(value));
    }

    public double cos(double value) {
        return Math.cos(Math.toRadians(value));
    }

    public double tan(double value) {
        return Math.tan(Math.toRadians(value));
    }

    public double log(double value) {
        if (value <= 0) {
            throw new ArithmeticException("Logaritmo de número não positivo não é permitido");
        }
        return Math.log10(value);
    }

    public double ln(double value) {
        if (value <= 0) {
            throw new ArithmeticException("Logaritmo natural de número não positivo não é permitido");
        }
        return Math.log(value);
    }

    public double factorial(double value) {
        if (value < 0 || value != Math.floor(value)) {
            throw new ArithmeticException("Fatorial só é definido para números inteiros não negativos");
        }
        long result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    public double percentage(double value, double percent) {
        return (value * percent) / 100;
    }

    public double abs(double value) {
        return Math.abs(value);
    }

    public double calculate(String operation, double value1, double value2) {
        switch (operation.toLowerCase()) {
            case "add":
            case "+":
                return add(value1, value2);
            case "subtract":
            case "-":
                return subtract(value1, value2);
            case "multiply":
            case "*":
                return multiply(value1, value2);
            case "divide":
            case "/":
                return divide(value1, value2);
            case "power":
            case "^":
                return power(value1, value2);
            case "percentage":
            case "%":
                return percentage(value1, value2);
            default:
                throw new IllegalArgumentException("Operação não suportada: " + operation);
        }
    }

    public double calculateSingle(String operation, double value) {
        switch (operation.toLowerCase()) {
            case "sqrt":
                return sqrt(value);
            case "sin":
                return sin(value);
            case "cos":
                return cos(value);
            case "tan":
                return tan(value);
            case "log":
                return log(value);
            case "ln":
                return ln(value);
            case "factorial":
            case "!":
                return factorial(value);
            case "abs":
                return abs(value);
            default:
                throw new IllegalArgumentException("Operação não suportada: " + operation);
        }
    }
}
