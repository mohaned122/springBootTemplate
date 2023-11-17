package com.mohaned.secondeProject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.mohaned.secondeProject.model.Departement;
import com.mohaned.secondeProject.model.position;

@Service
public class DepartementService {
    private static final List<Departement> departements = new ArrayList<>();
    static{
        departements.add(new Departement(UUID.randomUUID().toString(),"comptabilité","gaza",position.Manager));
        departements.add(new Departement(UUID.randomUUID().toString(),"vent","gaza",position.TeamLeader));
        departements.add(new Departement(UUID.randomUUID().toString(),"marketing","gaza",position.Supervisor));
        departements.add(new Departement(UUID.randomUUID().toString(),"HR","gaza",position.Member));
    }

    public List<Departement> getAllDepartement(){
        return  departements;
    }
}
