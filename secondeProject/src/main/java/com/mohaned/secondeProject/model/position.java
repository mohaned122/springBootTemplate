package com.mohaned.secondeProject.model;

public enum position {
    Manager,TeamLeader,Supervisor,Member;
    
    public String ToString(){
        switch(this){
            case Manager: return "Manager";
            case TeamLeader :return "Team Leader";
            case Supervisor : return "Supervisor";
            default: return "Member";
        }
    }
}
