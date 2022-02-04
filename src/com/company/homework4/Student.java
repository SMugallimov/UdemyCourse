package com.company.homework4;

public class Student {
    int studentId;
    String studentName;
    int year;
    int averageMathScore;
    int averageEconomicScore;
    int averageLanguageScore;

    public Student(String studentName, int studentId, int year){
        this.studentName = studentName;
        this.studentId = studentId;
        this.year = year;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getStudentName() {
        return studentName;
    }
    public int getStudentId() {
        return studentId;
    }
    public int getYear(){
        return year;
    }

    public double scoreCalculator(int averageEconomicScore, int averageMathScore, int averageLanguageScore){
        double result = 0;
        return result = (averageEconomicScore + averageMathScore + averageLanguageScore) / 3;
    }
}
