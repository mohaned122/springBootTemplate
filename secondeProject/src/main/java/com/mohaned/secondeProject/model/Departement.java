package com.mohaned.secondeProject.model;

public class Departement {
    private String departementId;
    private String nameDepartment;
    private String branche;
    private position Position;

     public Departement(String departementId, String nameDepartment, String branche, position Position) {
        this.departementId = departementId;
        this.nameDepartment = nameDepartment;
        this.branche = branche;
        this.Position = Position;
    }
    
    public String getDepartementId() {
        return this.departementId;
    }

    public void setDepartementId(String departementId) {
        this.departementId = departementId;
    }

    public String getNameDepartment() {
        return this.nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getBranche() {
        return this.branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public position getPosition() {
        return this.Position;
    }

    public void setPosition(position Position) {
        this.Position = Position;
    }
}
