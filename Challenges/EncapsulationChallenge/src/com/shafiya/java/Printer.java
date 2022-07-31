package com.shafiya.java;

public class Printer {
    private int toner;
    private int pages = 0;
    private boolean isDuplex;

    public Printer(int toner, boolean isDuplex) {
        this.toner = toner;
        if(this.toner < 0){
            this.toner = 0;
        } else if(this.toner > 100){
            this.toner = 100;
        }
        this.isDuplex = isDuplex;
    }

    public void fillToner(int fillAmount){
        if(fillAmount < 0){
            fillAmount = 0;
        } else if(fillAmount > 100){
            fillAmount = 100;
        }

        this.toner += fillAmount;

        if(this.toner < 0){
            this.toner = 0;
        } else if(this.toner > 100){
            this.toner = 100;
        }

        System.out.println("Toner is " + this.toner + "% filled.");
    }
    public void print(int pages){
        if(isDuplex){
            pages = (pages/2) + (pages % 2);
        }
        this.pages = pages;
        System.out.println("Printing " + pages + " pages.");
        int counter = 1;
        while(pages > 0 && this.toner > 0){
            System.out.println("Printing page #" + counter);
            counter++;
            pages--;
            this.toner--;
        }
        if(pages > 0){
            System.out.println("Not enough toner.");
        }
    }

    public int getToner() {
        return toner;
    }

    public int getPages() {
        return pages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
