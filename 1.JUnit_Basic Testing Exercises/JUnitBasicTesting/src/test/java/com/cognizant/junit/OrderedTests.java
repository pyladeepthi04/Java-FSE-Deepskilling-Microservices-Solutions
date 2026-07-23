package com.cognizant.junit;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void firstTest() {
        System.out.println("This is the First Test");
    }

    @Test
    @Order(2)
    void secondTest() {
        System.out.println("This is the Second Test");
    }

    @Test
    @Order(3)
    void thirdTest() {
        System.out.println("This is the Third Test");
    }
}