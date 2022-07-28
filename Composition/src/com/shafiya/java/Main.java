package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case myCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2440, 1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC myPC = new PC(myCase, monitor, motherboard);

        myPC.getMonitors().drawPixelAt(2000, 5000, "Blue");
        myPC.getMotherboard().loadProgram("Windows 1.0");
        myPC.getMyCase().pressPowerButton();
    }
}