package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.add(10, 20));
    }
}