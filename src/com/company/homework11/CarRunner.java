package com.company.homework11;

public class CarRunner {

    public void doorChanger(Car car, int value){
        car.quantityDoors = value;
    }

    public void colorSwap(Car car1, Car car2){
        String color;
        color = car1.carColor;
        car1.carColor = car2.carColor;
        car2.carColor = color;
    }
    public static void main(String[] args) {
        Car car1 = new Car("Blue", "v4", 5);
        Car car2 = new Car("White", "v6", 3);

        CarRunner carRunner = new CarRunner();
        carRunner.doorChanger(car1, 3);
        carRunner.colorSwap(car1, car2);

        System.out.println("First car: " + "Car color - " + car1.carColor +
                "; Car motor - " + car1.motorType + "; Car doors - " + car1.quantityDoors);

        System.out.println("Second car: " + "Car color - " + car2.carColor +
                "; Car motor - " + car2.motorType + "; Car doors - " + car2.quantityDoors);

    }
}