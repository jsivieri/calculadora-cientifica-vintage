package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String hello() {
        return "Hello, Spring Boot!";
    }
    
    @GetMapping("/api/hello")
    public String apiHello() {
        return "Hello from Spring Boot API!";
    }
}
