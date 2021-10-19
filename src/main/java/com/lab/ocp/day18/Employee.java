package com.lab.ocp.day18;

import java.io.Serializable;


public class Employee implements Serializable{
    private String name;
    private transient int Salary;
    //private int Salary;
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", Salary=" + Salary + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    
}
