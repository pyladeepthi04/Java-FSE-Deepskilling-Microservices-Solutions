package com.cognizant.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cognizant.junit.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorAAATest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println("Setup Method Executed");
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown Method Executed");
    }

    @Test
    void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @Test
    void testSubtraction() {

        // Arrange
        int a = 20;
        int b = 10;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(10, result);
    }
}