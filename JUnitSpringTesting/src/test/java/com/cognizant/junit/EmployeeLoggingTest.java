package com.cognizant.junit.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.cognizant.junit.model.Employee;
import com.cognizant.junit.repository.EmployeeRepository;

public class EmployeeLoggingTest {

    @Test
    void testLogging() {

        EmployeeRepository repository = Mockito.mock(EmployeeRepository.class);

        EmployeeService service = new EmployeeService(repository);

        Employee employee = new Employee(1, "Deepthi");

        when(repository.findById(1)).thenReturn(employee);

        Employee result = service.getEmployee(1);

        assertNotNull(result);
    }
}