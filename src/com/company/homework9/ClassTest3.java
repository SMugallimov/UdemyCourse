package com.company.homework9;

public class ClassTest3 {

    int a = 1;
    public static int b = 2;

    public void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(ClassTest3.b);
    }

    public static void main(String[] args) {
        ClassTest3 classTest3 = new ClassTest3();
        classTest3.abc(4);
    }
}