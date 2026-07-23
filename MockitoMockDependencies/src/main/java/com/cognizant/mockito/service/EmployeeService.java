package com.cognizant.mockito.service;

import org.springframework.stereotype.Service;

import com.cognizant.mockito.model.Employee;
import com.cognizant.mockito.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Employee getEmployeeById(int id) {
        return repository.findById(id);
    }
}