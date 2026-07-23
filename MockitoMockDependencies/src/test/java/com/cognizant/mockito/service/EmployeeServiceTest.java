package com.cognizant.mockito.service;

import com.cognizant.mockito.model.Employee;
import com.cognizant.mockito.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeServiceTest {

    @Test
    void testGetEmployeeById() {

        EmployeeRepository repository = Mockito.mock(EmployeeRepository.class);

        Mockito.when(repository.findById(1))
                .thenReturn(new Employee(1, "Deepthi"));

        EmployeeService service = new EmployeeService(repository);

        Employee employee = service.getEmployeeById(1);

        assertEquals(1, employee.getId());
        assertEquals("Deepthi", employee.getName());
    }
}