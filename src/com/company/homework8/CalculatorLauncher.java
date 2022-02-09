package com.company.homework8;

public class CalculatorLauncher {
    public static void main(String[] args) {
        System.out.println(Calculator.multiplier(5,5,5));
        Calculator.divider(5, 3);
        System.out.println("++++++++++++++");

        SquareCalculator squareCalculator = new SquareCalculator();

        squareCalculator.squareCircle(4);
        SquareCalculator.lengthCircle(4);
        squareCalculator.printData(4);
    }
}