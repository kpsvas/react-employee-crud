package com.employeecrudexample.springboot.controller;

import com.employeecrudexample.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.employeecrudexample.springboot.service.EmployeeService;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService empService;
    @RequestMapping(value="/employees", method=RequestMethod.POST)
    public Employee createEmployee(@RequestBody Employee emp) {
        return empService.createEmployee(emp);
    }
    @RequestMapping(value="/employees", method=RequestMethod.GET)
    public List<Employee> readEmployees() {
        return empService.getEmployees();
    }

    @RequestMapping(value="/employees/{id}", method=RequestMethod.PUT)
    public Employee updateEmployees(@PathVariable(value = "id") Long id, @RequestBody Employee empDetails) {
        return empService.updateEmployee(id, empDetails);
    }

    @RequestMapping(value="/employees/{id}", method=RequestMethod.GET)
    public Employee readOneEmployees(@PathVariable(value = "id") Long id) {
        return empService.getEmployeeById(id);
    }

    @RequestMapping(value="/employees/{id}", method=RequestMethod.DELETE)
    public void deleteEmployees(@PathVariable(value = "id") Long id) {
        empService.deleteEmployee(id);
    }
}
