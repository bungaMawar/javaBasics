package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        Car honda = new Car();

        System.out.println("Model is " + honda.getModel());
        honda.setModel("Civic");
        System.out.println("Model is " + honda.getModel());
        honda.setModel("Oddessy");
        System.out.println("Model is " + honda.getModel());
    }
}