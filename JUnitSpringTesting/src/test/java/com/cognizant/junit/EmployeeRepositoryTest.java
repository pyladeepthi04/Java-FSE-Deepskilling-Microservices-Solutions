package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.cognizant.junit.model.Employee;
import com.cognizant.junit.repository.EmployeeRepository;

public class EmployeeRepositoryTest {

    @Test
    void testFindByName() {

        EmployeeRepository repository = Mockito.mock(EmployeeRepository.class);

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Deepthi"),
                new Employee(2, "Deepthi")
        );

        when(repository.findByName("Deepthi")).thenReturn(employees);

        List<Employee> result = repository.findByName("Deepthi");

        assertEquals(2, result.size());
        assertEquals("Deepthi", result.get(0).getName());
    }
}