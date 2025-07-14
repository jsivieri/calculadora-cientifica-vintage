package com.example.demo.controller;

import com.example.demo.model.CalculatorRequest;
import com.example.demo.model.CalculatorResponse;
import com.example.demo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
@CrossOrigin(origins = "*")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/calculate")
    public ResponseEntity<CalculatorResponse> calculate(@RequestBody CalculatorRequest request) {
        try {
            double result = calculatorService.calculate(request.getOperation(), request.getValue1(), request.getValue2());
            return ResponseEntity.ok(new CalculatorResponse(result, request.getOperation()));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    @PostMapping("/calculate-single")
    public ResponseEntity<CalculatorResponse> calculateSingle(@RequestParam String operation, @RequestParam double value) {
        try {
            double result = calculatorService.calculateSingle(operation, value);
            return ResponseEntity.ok(new CalculatorResponse(result, operation));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    // Endpoints específicos para operações básicas
    @GetMapping("/add")
    public ResponseEntity<CalculatorResponse> add(@RequestParam double a, @RequestParam double b) {
        try {
            double result = calculatorService.add(a, b);
            return ResponseEntity.ok(new CalculatorResponse(result, "add"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    @GetMapping("/subtract")
    public ResponseEntity<CalculatorResponse> subtract(@RequestParam double a, @RequestParam double b) {
        try {
            double result = calculatorService.subtract(a, b);
            return ResponseEntity.ok(new CalculatorResponse(result, "subtract"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    @GetMapping("/multiply")
    public ResponseEntity<CalculatorResponse> multiply(@RequestParam double a, @RequestParam double b) {
        try {
            double result = calculatorService.multiply(a, b);
            return ResponseEntity.ok(new CalculatorResponse(result, "multiply"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    @GetMapping("/divide")
    public ResponseEntity<CalculatorResponse> divide(@RequestParam double a, @RequestParam double b) {
        try {
            double result = calculatorService.divide(a, b);
            return ResponseEntity.ok(new CalculatorResponse(result, "divide"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    // Endpoints para funções científicas
    @GetMapping("/sqrt")
    public ResponseEntity<CalculatorResponse> sqrt(@RequestParam double value) {
        try {
            double result = calculatorService.sqrt(value);
            return ResponseEntity.ok(new CalculatorResponse(result, "sqrt"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    @GetMapping("/sin")
    public ResponseEntity<CalculatorResponse> sin(@RequestParam double value) {
        try {
            double result = calculatorService.sin(value);
            return ResponseEntity.ok(new CalculatorResponse(result, "sin"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    @GetMapping("/cos")
    public ResponseEntity<CalculatorResponse> cos(@RequestParam double value) {
        try {
            double result = calculatorService.cos(value);
            return ResponseEntity.ok(new CalculatorResponse(result, "cos"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    @GetMapping("/tan")
    public ResponseEntity<CalculatorResponse> tan(@RequestParam double value) {
        try {
            double result = calculatorService.tan(value);
            return ResponseEntity.ok(new CalculatorResponse(result, "tan"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    @GetMapping("/log")
    public ResponseEntity<CalculatorResponse> log(@RequestParam double value) {
        try {
            double result = calculatorService.log(value);
            return ResponseEntity.ok(new CalculatorResponse(result, "log"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    @GetMapping("/ln")
    public ResponseEntity<CalculatorResponse> ln(@RequestParam double value) {
        try {
            double result = calculatorService.ln(value);
            return ResponseEntity.ok(new CalculatorResponse(result, "ln"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    @GetMapping("/factorial")
    public ResponseEntity<CalculatorResponse> factorial(@RequestParam double value) {
        try {
            double result = calculatorService.factorial(value);
            return ResponseEntity.ok(new CalculatorResponse(result, "factorial"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }

    @GetMapping("/power")
    public ResponseEntity<CalculatorResponse> power(@RequestParam double base, @RequestParam double exponent) {
        try {
            double result = calculatorService.power(base, exponent);
            return ResponseEntity.ok(new CalculatorResponse(result, "power"));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new CalculatorResponse(e.getMessage()));
        }
    }
}
