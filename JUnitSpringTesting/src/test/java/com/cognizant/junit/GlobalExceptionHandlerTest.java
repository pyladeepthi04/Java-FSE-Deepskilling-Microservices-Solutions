package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalExceptionHandlerTest {

    @Test
    void testHandleException() {

        GlobalExceptionHandler handler = new GlobalExceptionHandler();

        ResponseEntity<String> response =
                handler.handleException(new NoSuchElementException());

        assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
        assertEquals("Employee not found", response.getBody());
    }
}