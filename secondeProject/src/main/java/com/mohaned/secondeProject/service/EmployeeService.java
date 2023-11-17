package com.mohaned.secondeProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mohaned.secondeProject.model.Employees;

@Service
public class EmployeeService {
     private static final List<Employees> employees = new ArrayList<>();
    static{
        for(int i=0;i<10;i++){
            employees.add(i, new Employees());
        }
    }
    
    public List<Employees> getAllEmployee(){
        return employees;
    }
}
