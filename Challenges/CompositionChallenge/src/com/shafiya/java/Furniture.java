package com.shafiya.java;

public class Furniture {
    private int numberOfLegs;
    private String material;
    private int size;
    private String shape;

    public Furniture(int numberOfLegs, String material, int size, String shape) {
        this.numberOfLegs = numberOfLegs;
        this.material = material;
        this.size = size;
        this.shape = shape;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getMaterial() {
        return material;
    }

    public int getSize() {
        return size;
    }

    public String getShape() {
        return shape;
    }
}
