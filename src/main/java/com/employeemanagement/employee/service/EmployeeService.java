package com.employeemanagement.employee.service;

import com.employeemanagement.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> listAllEmployees();
    public void saveEmployee(Employee employee);
}
