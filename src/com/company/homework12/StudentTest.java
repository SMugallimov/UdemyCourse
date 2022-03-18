package com.company.homework12;

public class StudentTest {

    public void studentComparison(Student student1, Student student2) {

        if (student1.studentName.equals(student2.studentName) && student1.studentId == student2.studentId &&
                student1.className == student2.className && student1.year == student2.year) {
            System.out.println("Students are equal!");
        }
        else{
            System.out.println("Students are different!");
        }
    }

    public void studentComparisonDetailed(Student student1, Student student2){
        if(student1.studentName.equals(student2.studentName)){
            if(student1.className == student2.className){
                if(student1.year == student2.year){
                    System.out.println("Student names, classes, years are same!");
                }
                else{
                    System.out.println("Student names, classes are equal, but years are different!");
                }
            }
            else{
                System.out.println("Student names are equal, but classes are different!");
            }
        }
        else{
            System.out.println("Student names are different!");
        }
    }
    public static void main(String[] args) {

        Student student1 = new Student("Vadim", 1234, "Whales", 4);
        Student student2 = new Student("Vadim", 1234, "Oryx", 3);
        StudentTest studentTest = new StudentTest();
        studentTest.studentComparison(student1, student2);

        studentTest.studentComparisonDetailed(student1, student2);
    }
}