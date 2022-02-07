package com.company.homework6;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Sum of ZERO = " + sum());
        System.out.println("Sum of ONE = " + sum(5));
        System.out.println("Sum of TWO = " + sum(5, 5));
        System.out.println("Sum of THREE = " + sum(5, 5, 5));
        System.out.println("Sum of FOUR = " + sum(5, 5, 5, 5));
    }
    public static int sum(){
        return 0;
    }
    public static int sum (int num1){
        return ++num1;
    }
    public static int sum (int num1, int num2){
        return num1 + num2;
    }
    public static int sum(int num1, int num2,int num3){
        return num1 + num2 + num3;
    }
    public static int sum(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }
}