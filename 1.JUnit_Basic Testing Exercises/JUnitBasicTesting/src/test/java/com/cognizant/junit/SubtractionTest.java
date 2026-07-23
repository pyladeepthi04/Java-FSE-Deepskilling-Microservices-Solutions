package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SubtractionTest {

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.subtract(20, 10));
    }
}