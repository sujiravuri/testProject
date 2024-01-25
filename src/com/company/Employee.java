package com.company;




public class Employee {

    private Integer id;
    private String name;
    private String designation;
    private double salary;
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee(Integer id, String name, String designation, double salary, String location) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.location = location;
    }
}
