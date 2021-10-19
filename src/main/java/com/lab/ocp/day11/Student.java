package com.lab.ocp.day11;

public class Student implements Comparable<Student>{

    private String name;
    private int age;

    public Student()  {
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return age-o.age; //To change body of generated methods, choose Tools | Templates.
    }

}
