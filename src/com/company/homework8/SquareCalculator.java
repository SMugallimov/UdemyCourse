package com.company.homework8;

public class SquareCalculator {
    private static final double PI = 3.14;

    public double squareCircle(int radius){
        return PI * radius * radius;
    }
    public static double lengthCircle (int radius){
        return 2 * PI * radius;
    }
    public void printData(int radius){
        System.out.println("Radius = " + radius);
        System.out.println("Square of circle = " + squareCircle(radius));
        System.out.println("Length of circle = " + lengthCircle(radius));
    }
}