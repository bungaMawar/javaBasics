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

    public void powerUp(){
        myCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        monitors.drawPixelAt(1200, 50, "yellow");
    }

}
