package com.company.homework6;

import java.lang.annotation.Target;

public class Student {

    private String studentName;
    private int year;
    private int studentId;
    private int course;

    public Student(String studentName, int year, int studentId, int course){
        this.studentName = studentName;
        this.year = year;
        this.studentId = studentId;
        this.course = course;
    }
    public Student(String studentName, int studentId, int course){
        this.studentName = studentName;
        this.studentId = studentId;
        this.course = course;
    }
    public Student(){

    }

    public String getStudentName() {
        return studentName;
    }

    public int getYear() {
        return year;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourse() {
        return course;
    }
}