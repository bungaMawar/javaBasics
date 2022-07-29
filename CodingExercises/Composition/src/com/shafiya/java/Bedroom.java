package com.shafiya.java;

public class Bedroom {
    private String name;
    private Wall wall1, wall2, wall3, wall4;
    private Bed bed;
    private Lamp lamp;
    private Ceiling ceiling;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
        this.lamp = lamp;
        this.ceiling = ceiling;
    }

    public Lamp getLamp(){
        return lamp;
    }

    public Ceiling getCeiling(){
        return ceiling;
    }
    public void makeBed(){
        bed.make();
        System.out.print("Bedroom -> Making bed | ");
    }
}
