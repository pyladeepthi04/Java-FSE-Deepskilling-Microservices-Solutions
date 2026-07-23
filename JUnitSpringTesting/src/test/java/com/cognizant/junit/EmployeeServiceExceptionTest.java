package com.cognizant.junit.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cognizant.junit.repository.EmployeeRepository;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceExceptionTest {

    @Mock
    private EmployeeRepository repository;

    @InjectMocks
    private EmployeeService service;

    @Test
    void testEmployeeNotFound() {

        when(repository.findById(100)).thenReturn(null);

        assertThrows(NoSuchElementException.class, () -> {
            service.getEmployee(100);
        });
    }
}