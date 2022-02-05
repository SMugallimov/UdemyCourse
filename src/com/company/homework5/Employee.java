package com.company.homework5;

public class Employee {
    private String name;
    private int id;
    private int age;
    private int salary;

    public Employee(String name, int id, int age, int salary){
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public int salaryIncrease(){
        return salary * 2;
    }
}