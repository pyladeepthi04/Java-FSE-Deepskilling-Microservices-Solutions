package com.cognizant.mockito.repository;

import com.cognizant.mockito.model.Employee;

public interface EmployeeRepository {

    Employee findById(int id);

}