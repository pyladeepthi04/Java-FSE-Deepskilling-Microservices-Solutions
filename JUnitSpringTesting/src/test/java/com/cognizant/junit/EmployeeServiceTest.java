package com.cognizant.junit.service;

import com.cognizant.junit.model.Employee;
import com.cognizant.junit.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class EmployeeServiceTest {

    @Test
    void testGetEmployee() {

        EmployeeRepository repository = mock(EmployeeRepository.class);

        Employee employee = new Employee(1, "Deepthi");

        when(repository.findById(1)).thenReturn(employee);

        EmployeeService service = new EmployeeService(repository);

        Employee result = service.getEmployee(1);

        assertEquals("Deepthi", result.getName());

        verify(repository).findById(1);
    }
}