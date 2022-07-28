package com.shafiya.java;

public class Room {
    private Window window;
    private Door door;
    private String type;
    private int temperature;

    public Room(Window window, Door door, String type) {
        this.window = window;
        this.door = door;
        this.type = type;
        this.temperature = 73;
    }

    public void changeStateOfWindow(){
        window.openAndClose();
    }
    public void changeStateOfDoor(){
        door.openAndClose();
    }
    public void changeTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("Temperature of room is " + this.temperature + " degrees.");
    }
    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }

    public String getType() {
        return type;
    }
    public int getTemperature(){
        return temperature;
    }
}
