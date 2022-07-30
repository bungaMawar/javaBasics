package com.shafiya.java;

public class Printer {
    private int toner;
    private int pages;
    private boolean isDuplex;

    public Printer(int toner, int pages, boolean isDuplex) {
        this.toner = toner;
        if(this.toner < 0){
            this.toner = 0;
        } else if(this.toner > 100){
            this.toner = 100;
        }
        this.pages = pages;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int fillAmount){
        this.toner += fillAmount;
        if(this.toner < 0){
            this.toner = 0;
        } else if(this.toner > 100){
            this.toner = 100;
        }
        System.out.println("Toner is " + this.toner + "% filled.");
    }
    public void print(){
        if(isDuplex){
            this.pages = this.pages/2;
        }

        System.out.println("Printing " + this.pages + " pages.");
        int counter = 1;
        while(this.pages > 0 && this.toner > 0){
            System.out.println("Printing page #" + counter);
            counter++;
            this.pages--;
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
