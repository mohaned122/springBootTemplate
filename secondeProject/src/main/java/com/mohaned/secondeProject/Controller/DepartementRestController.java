package com.mohaned.secondeProject.Controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohaned.secondeProject.model.Departement;
import com.mohaned.secondeProject.service.DepartementService;

@RestController
@RequestMapping("/api/departements")
public class DepartementRestController {
    private final DepartementService departementService;

    public DepartementRestController(DepartementService departementService) {
        this.departementService = departementService;
    }

    @GetMapping
    public List<Departement> getAllDepartement(){
        
        return departementService.getAllDepartement();
    }
}
