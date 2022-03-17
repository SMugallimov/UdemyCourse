package com.company.homework11;

public class CarRunner {

    public void doorChanger(Car car1, int d){
        car1.doors = d;
    }
    public void colorChanger(Car car1, Car car2){
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
    }
    public static void main(String[] args) {
        CarRunner carRunner = new CarRunner();
        Car car1 = new Car("Blue", "v6", 5);
        Car car2 = new Car("White", "v6", 3);
        carRunner.doorChanger(car1, 3);
        carRunner.colorChanger(car1, car2);
        System.out.println("First car -- " + "Color: " + car1.color + ". Motor type: " + car1.motorType +
                ". Quantity of doors: " + car1.doors);
        System.out.println("Second car -- " + "Color: " + car2.color + ". Motor type: " + car2.motorType +
                ". Quantity of doors: " + car2.doors);
    }
}