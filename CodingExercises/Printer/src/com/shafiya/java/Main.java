package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        System.out.println(printer.addToner(50));
        System.out.println("Initial page count: " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);

        System.out.println("Pages printed was: " + pagesPrinted +
                ". New total print count for pages: " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was: " + pagesPrinted +
                ". New total print count for pages: " + printer.getPagesPrinted());
    }
}