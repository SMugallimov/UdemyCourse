package com.company.homework6;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Vadim ", 2014, 123,3);
        System.out.println("Student name: " + student1.getStudentName());
        System.out.println("Birth: " + student1.getYear());
        System.out.println("ID: " + student1.getStudentId());
        System.out.println("Course: " + student1.getCourse());

        Student student2 = new Student("Arina", 456, 2);
        System.out.println("Student name: " + student2.getStudentName());
        System.out.println("ID: " + student2.getStudentId());
        System.out.println("Course: " + student2.getCourse());

        Student student3 = new Student();
        System.out.println("Student name: " + student3.getStudentName());
        System.out.println("Birth: " + student3.getYear());
        System.out.println("ID: " + student3.getStudentId());
        System.out.println("Course: " + student3.getCourse());
    }
}