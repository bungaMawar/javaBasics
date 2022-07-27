package com.shafiya.java;

import java.sql.SQLOutput;

public class Vehicle {
    private String name;
    private int size;
    private boolean isManual;
    private int maxSpeed;
    private int currentSpeed;
    private String steering;
    private int wheels;

    public Vehicle(String name, int size, boolean isManual, int maxSpeed, String steering, int wheels) {
        this.name = name;
        if(size < 0) {
            this.size = 0;
        }
        else{
            this.size = size;
        }
        this.isManual = isManual;
        if(maxSpeed < 0) {
            this.maxSpeed = 0;
        }
        else{
            this.maxSpeed = maxSpeed;
        }
        this.steering = steering;
        if(wheels < 0){
            this.wheels = 0;
        }
        else{
            this.wheels = wheels;
        }
        this.currentSpeed = 0;
    }

    public void decelerating(int speed){
        this.currentSpeed -= speed;
        System.out.println("Vehicle is decelerating by " + speed);
    }
    public void accelerating(int speed){
        this.currentSpeed += speed;
        System.out.println("Vehicle is accelerating by " + speed);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getSteering() {
        return steering;
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

}
