package com.cognizant.junit.repository;

import java.util.List;

import com.cognizant.junit.model.Employee;

public interface EmployeeRepository {

    Employee findById(int id);

    List<Employee> findByName(String name);

    Employee save(Employee employee);
}