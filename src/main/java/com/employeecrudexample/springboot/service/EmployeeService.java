package com.employeecrudexample.springboot.service;

import com.employeecrudexample.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {

     Employee createEmployee(Employee employee);

   Employee getEmployeeById(Long employeeId);

    void deleteEmployee(Long employeeId);

    List<Employee> getEmployees();

    Employee updateEmployee(Long id, Employee empDetails);
}
