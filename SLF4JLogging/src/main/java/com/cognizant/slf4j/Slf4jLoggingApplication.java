package com.cognizant.slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.slf4j.service.LoggingExample;

@SpringBootApplication
public class Slf4jLoggingApplication implements CommandLineRunner {

    private final LoggingExample loggingExample;

    public Slf4jLoggingApplication(LoggingExample loggingExample) {
        this.loggingExample = loggingExample;
    }

    public static void main(String[] args) {
        SpringApplication.run(Slf4jLoggingApplication.class, args);
    }

    @Override
    public void run(String... args) {

        loggingExample.demonstrateLogging();
    }
}