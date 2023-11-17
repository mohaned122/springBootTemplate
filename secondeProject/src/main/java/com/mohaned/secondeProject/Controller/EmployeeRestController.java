package com.mohaned.secondeProject.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohaned.secondeProject.model.Employees;
import com.mohaned.secondeProject.service.EmployeeService;
@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employees> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
}
