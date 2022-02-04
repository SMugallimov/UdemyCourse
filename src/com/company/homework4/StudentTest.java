package com.company.homework4;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("Student One", 1234, 2008);
        Student student2 = new Student("Student Two", 5678, 2007);
        Student student3 = new Student("Student Three", 4321, 2009);


        double averageResult2 = student2.scoreCalculator(3, 4, 4);
        double averageResult3 = student3.scoreCalculator(5, 3, 4);

        System.out.print("Student name: " + student1.getStudentName() + " ");
        System.out.print("ID: " + student1.studentId + " ");
        System.out.print("Year: " + student1.getYear() + " ");
        System.out.println("Average Score: " + student1.scoreCalculator(3, 5, 4));

        System.out.print("Student name: " + student2.getStudentName() + " ");
        System.out.print("ID: " + student2.studentId + " ");
        System.out.print("Year: " + student2.getYear() + " ");
        System.out.println("Average Score: " + student2.scoreCalculator(4, 4, 5));

        System.out.print("Student name: " + student3.getStudentName() + " ");
        System.out.print("ID: " + student3.studentId + " ");
        System.out.print("Year: " + student3.getYear() + " ");
        System.out.println("Average Score: " + student3.scoreCalculator(5, 5, 4));
    }
}
