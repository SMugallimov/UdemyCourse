package com.company.homework12;

public class Student {
    public String studentName;
    public String className;
    public int studentId;
    public int year;

    public Student(String studentName, int studentId, String className,  int year){
        this.studentName = studentName;
        this.studentId = studentId;
        this.className = className;
        this.year = year;
    }
}