package com.cognizant.resourceserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Resource Server";
    }

    @GetMapping("/secure")
    public String secure() {
        return "This is a secured API using OAuth2 Resource Server.";
    }
}