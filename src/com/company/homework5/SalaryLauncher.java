package com.company.homework5;

public class SalaryLauncher {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vadim", 13062014, 7, 500_000);
        Employee employee2 = new Employee("Arina", 14022017, 4, 500_000);

        String employeeName1 = employee1.getName();
        int employeeId1 = employee1.getId();
        int employeeAge1 = employee1.getAge();
        int employeeSalary1 = employee1.getSalary();
        int newSalary1 = employee1.salaryIncrease();

        String employeeName2 = employee2.getName();
        int employeeId2 = employee2.getId();
        int employeeAge2 = employee2.getAge();
        int employeeSalary2 = employee2.getSalary();
        int newSalary2 = employee2.salaryIncrease();

        System.out.println(employeeName1 + " " + " ID: " + employeeId1 + " Age: " + employeeAge1 +
                " Salary: " + employeeSalary1 + " New Salary: " + newSalary1);

        System.out.println(employeeName2 + " " + " ID: " + employeeId2 + " Age: " + employeeAge2 +
                " Salary: " + employeeSalary2 + " New Salary: " + newSalary2);
    }

}
