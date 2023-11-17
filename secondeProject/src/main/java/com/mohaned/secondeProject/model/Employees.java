package com.mohaned.secondeProject.model;

public class Employees {
    private int id;
    private String name;
    private int age;
    private String sex;

    public Employees(){
        this.id = 17;
        this.name ="mohanned";
        this.sex ="homme";
        this.age = 21;
    }
    
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
