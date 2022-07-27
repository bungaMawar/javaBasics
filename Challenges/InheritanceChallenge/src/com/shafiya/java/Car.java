package com.shafiya.java;

public class Car extends Vehicle{
    private boolean isConvertible;
    private String brand;
    private String model;

    public Car(int size, boolean isManual, int maxSpeed, boolean isConvertible, String brand, String model) {
        super("Car", size, isManual, maxSpeed, "Wheel", 4);
        this.brand = brand;
        this.model = model;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void decelerating(int speed) {
        System.out.println(brand + " " + model + " is decelerating by " + speed);
    }

    @Override
    public void accelerating(int speed) {
        System.out.println(brand + " " + model + " is decelerating by " + speed);
    }
}
