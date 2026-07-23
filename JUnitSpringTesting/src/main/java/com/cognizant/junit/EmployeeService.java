package com.cognizant.junit.service;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cognizant.junit.model.Employee;
import com.cognizant.junit.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private static final Logger logger =
            LoggerFactory.getLogger(EmployeeService.class);

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee getEmployee(int id) {

        logger.info("Fetching employee with id {}", id);

        Employee employee = repository.findById(id);

        if (employee == null) {

            logger.error("Employee not found with id {}", id);

            throw new NoSuchElementException("Employee not found");
        }

        logger.info("Employee found {}", employee.getName());

        return employee;
    }

    public Employee saveEmployee(Employee employee) {

        logger.info("Saving employee {}", employee.getName());

        return repository.save(employee);
    }
}