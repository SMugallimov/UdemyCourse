package com.company.homework12;

public class StudentTest {

    public void studentComparison(Student student1, Student student2){
        if(student1.studentName.equals(student2.studentName) && student1.studentYear == student2.studentYear &&
        student1.className == student2.className) {
            System.out.println("Both students are equal!");
        }
        else System.out.println("Students are different!");
    }

    public void studentDetailedComparison(Student student1, Student student2){
        if(student1.studentName.equals(student2.studentName)){
            if(student1.studentYear == student2.studentYear){
                if(student1.className == student2.className){
                    System.out.println("Students name, year and class name equal!");
                }
                else{
                    System.out.println("Students name and year equal, however class name is different!");
                }
            }
            else{
                System.out.println("Students name and class name equal, however students year different!");
            }
        }
        else{
            System.out.println("Students year and class name equal, however students name different!");
        }
    }
      public static void main(String[] args) {

        Student student1 = new Student("Arina", 3, "ORYX");
        Student student2 = new Student("Vadim", 3, "ORYX");
        StudentTest studentTest = new StudentTest();

        studentTest.studentComparison(student1, student2);
        studentTest.studentDetailedComparison(student1, student2);
    }
}