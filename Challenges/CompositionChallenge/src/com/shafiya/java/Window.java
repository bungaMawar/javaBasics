package com.shafiya.java;

public class Window {
    private String material;
    private String shape;
    private boolean isOpen;

    public Window(String material, String shape) {
        this.material = material;
        this.shape = shape;
        this.isOpen = false;
    }

    public void openAndClose(){
        if(!isOpen) {
            System.out.println("Window is closed.");
            isOpen = true;
        }
        else{
            System.out.println("Window is open.");
            isOpen = false;
        }
    }

    public String getMaterial() {
        return material;
    }

    public String getShape() {
        return shape;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
