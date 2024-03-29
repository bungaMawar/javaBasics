package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        // Create a single room of a house using composition.
        // Think about the things that should be included in the room.
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via a getter and
        // then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        Window window = new Window("Wood", "Square");
        Door door = new Door("Wood", "Circle", "Blue");
        Furniture chair = new Furniture(4, "Plastic", 5, "Square");
        Furniture desk = new Furniture(4, "Wood", 10, "Rectangle");
        Room bedRoom = new Room(window, door, "Bedroom");

        bedRoom.changeStateOfWindow();
        bedRoom.changeStateOfDoor();
        bedRoom.changeTemperature(80);

    }
}