package com.shafiya.java;

public class PC {
    private Case myCase;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case myCase, Monitor monitors, Motherboard motherboard) {
        this.myCase = myCase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }

    public Case getMyCase() {
        return myCase;
    }

    public Monitor getMonitors() {
        return monitors;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
