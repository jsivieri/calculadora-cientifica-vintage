package com.example.demo.model;

public class CalculatorResponse {
    private double result;
    private String operation;
    private String error;

    public CalculatorResponse() {}

    public CalculatorResponse(double result, String operation) {
        this.result = result;
        this.operation = operation;
    }

    public CalculatorResponse(String error) {
        this.error = error;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
