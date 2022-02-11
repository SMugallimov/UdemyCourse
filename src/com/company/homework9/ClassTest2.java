package com.company.homework9;

public class ClassTest2 {

    int a = 1;
    public static int b = 2;

    public static void abc(final int a){
        System.out.println(a);
        System.out.println(ClassTest2.b);
    }
    public static void main(String[] args) {
        abc(5);
    }
}