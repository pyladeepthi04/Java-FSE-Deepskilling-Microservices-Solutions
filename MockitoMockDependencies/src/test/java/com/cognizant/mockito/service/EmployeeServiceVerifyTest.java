package com.cognizant.mockito.service;

import com.cognizant.mockito.model.Employee;
import com.cognizant.mockito.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeServiceVerifyTest {

    @Test
    void testVerifyRepositoryCall() {

        // Create mock repository
        EmployeeRepository repository = Mockito.mock(EmployeeRepository.class);

        // Stub repository method
        Mockito.when(repository.findById(1))
                .thenReturn(new Employee(1, "Deepthi"));

        // Create service
        EmployeeService service = new EmployeeService(repository);

        // Call service method
        Employee employee = service.getEmployeeById(1);

        // Verify repository method was called exactly once
        Mockito.verify(repository, Mockito.times(1)).findById(1);

        // Verify returned data
        assertEquals(1, employee.getId());
        assertEquals("Deepthi", employee.getName());
    }
}