package com.shafiya.java;

public class Deluxe extends Hamburger{
    private String breadRollType;
    private String additions;
    private String meatType;
    private double totalPrice;
    private int additionCount;

    public Deluxe(String breadRollType, String meatType) {
        super("Deluxe", breadRollType, meatType);
        this.additions = "Chips, Drinks";
        this.totalPrice = 6.00;
        this.additionCount = 2;
    }
    @Override
    public String addAdditions(String addition) {
        return "Cannot add any more additions.";
    }
    public String getTotalPrice() {
        double additionsPrice = this.additionCount * 0.1;
        double basePrice = (this.totalPrice - additionsPrice);
        return "Base Price = $" + String.format("%.2f", basePrice) + "\n"
                + "Additions price for " + additions + " = $" + String.format("%.2f", additionsPrice) + "\n"
                + "Total Price = $" + String.format("%.2f", totalPrice);
    }
}
