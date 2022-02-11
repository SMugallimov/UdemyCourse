package com.company.homework9;

public class ClassTest1 {
    int a = 1;
//    public static int a = 2;

    public void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        ClassTest1 classTest1 = new ClassTest1();
        classTest1.abc(3);
    }
}