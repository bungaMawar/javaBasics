package com.shafiya.java;

public class Door {
    private String material;
    private boolean isOpen;
    private String knob;
    private String color;

    public Door(String material, String knob, String color) {
        this.material = material;
        this.isOpen = false;
        this.knob = knob;
        this.color = color;
    }

    public void openAndClose(){
        if(!isOpen) {
            System.out.println("Door is closed.");
            isOpen = true;
        }
        else{
            System.out.println("Door is open.");
            isOpen = false;
        }
    }
    public String getMaterial() {
        return material;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getKnob() {
        return knob;
    }

    public String getColor() {
        return color;
    }
}
