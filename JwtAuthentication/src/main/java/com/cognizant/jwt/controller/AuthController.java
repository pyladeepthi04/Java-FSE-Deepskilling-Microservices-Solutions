package com.cognizant.jwt.controller;

import com.cognizant.jwt.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @GetMapping("/")
    public String home() {
        return "JWT Authentication Project";
    }

    @GetMapping("/token")
    public String token() {
        return jwtTokenProvider.createToken("deepthi");
    }
}