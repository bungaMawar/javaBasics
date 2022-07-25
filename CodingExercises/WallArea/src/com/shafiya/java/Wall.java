package com.shafiya.java;

public class Wall {
    private double width;
    private double height;

    public Wall(){
        this(0,0);
    }
    public Wall(double width, double height){
        if(height <= 0d){
            this.height = 0;
        } else {
            this.height = height;
        }
        if(width <= 0d){
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setWidth(double width) {
        if(width <= 0d){
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height <= 0d){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return width * height;
    }
}
