package com.cognizant.mockito.controller;

import com.cognizant.mockito.model.Employee;
import com.cognizant.mockito.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeControllerTest {

    @Test
    void testGetEmployee() {

        EmployeeService service = Mockito.mock(EmployeeService.class);

        Mockito.when(service.getEmployeeById(1))
                .thenReturn(new Employee(1, "Deepthi"));

        EmployeeController controller = new EmployeeController(service);

        Employee employee = controller.getEmployee(1);

        assertEquals(1, employee.getId());
        assertEquals("Deepthi", employee.getName());
    }
}