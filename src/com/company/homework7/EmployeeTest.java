package com.company.homework7;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vadim", 1234, 100_000);

        System.out.println("Name: " + employee1.name + " ID: " + employee1.id);
    }
}