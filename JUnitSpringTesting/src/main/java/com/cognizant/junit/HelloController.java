package com.cognizant.junit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, JUnit!";
    }

    @GetMapping("/error")
    public String error() {
        throw new RuntimeException("Something went wrong!");
    }
}