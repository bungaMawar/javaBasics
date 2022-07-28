package com.shafiya.java;

public class Circle {
    private double radius;
    public static int diameter = 10;

    public Circle(){
        radius = 5;
    }
    public Circle(double radius) {
        if(radius < 0){
            this.radius = 0;
        }
        else {
            this.radius = radius;
        }
    }
    public static void printCircle(){
        //System.out.println(this.radius);
        System.out.println("circle");
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
