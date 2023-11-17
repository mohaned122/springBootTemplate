package com.mohaned.secondeProject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mohaned.secondeProject.service.DepartementService;

@Controller
@RequestMapping("/departements")
public class DepartementController {
    private final DepartementService departementService;

    public DepartementController(DepartementService departementService) {
        this.departementService = departementService;
    }

    @GetMapping
    public String getAllDepartement(Model model){
        model.addAttribute("departements", departementService.getAllDepartement());
        return "departements";
    }
}
