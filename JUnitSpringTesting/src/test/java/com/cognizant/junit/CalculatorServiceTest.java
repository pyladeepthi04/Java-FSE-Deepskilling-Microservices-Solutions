package com.cognizant.junit.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    @Test
    void testAdd() {

        CalculatorService service = new CalculatorService();

        assertEquals(30, service.add(10, 20));

    }
}