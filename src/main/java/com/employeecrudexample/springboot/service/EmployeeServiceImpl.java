package com.employeecrudexample.springboot.service;
import lombok.AllArgsConstructor;
import com.employeecrudexample.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.employeecrudexample.springboot.repository.EmployeeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository empRepository;
    public Employee createEmployee(Employee emp)
    {
        return empRepository.save(emp);
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return empRepository.findById(employeeId).orElse(null);
    }

    // READ
    public List<Employee> getEmployees() {
        return empRepository.findAll();
    }

    // DELETE
    public void deleteEmployee(Long empId) {
        empRepository.deleteById(empId);
    }
    // UPDATE
    public Employee updateEmployee(Long empId, Employee employeeDetails) {
        Employee emp = empRepository.findById(empId).get();
        emp.setFirstName(employeeDetails.getFirstName());
        emp.setLastName(employeeDetails.getLastName());
        emp.setEmailId(employeeDetails.getEmailId());

        return empRepository.save(emp);
    }

    }
