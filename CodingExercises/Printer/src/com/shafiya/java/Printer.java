package com.shafiya.java;
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel > 100 || tonerLevel <= -1){
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount <= -1 || tonerAmount > 100){
            return -1;
        }
        this.tonerLevel += tonerAmount;
        if(this.tonerLevel <= -1 || this.tonerLevel > 100){
            return -1;
        }
        return this.tonerLevel;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            pagesToPrint = (pages/2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        pagesPrinted = pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }
}
