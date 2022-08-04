package com.shafiya.java;

public class Hamburger {
    private String breadRollType;
    private String additions;
    private String meatType;
    private double totalPrice;
    private String name;
    private int additionCount;

    public Hamburger(String name, String breadRollType, String meatType) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.totalPrice = 5.00;
        this.name = name;
        this.additions = "None";
        this.additionCount = 0;
    }

    public String addAdditions(String addition) {
        if(additionCount >= 4){
            return "Cannot add any more additions.";
        } else{
            additionCount++;
            if(additionCount == 1){
                this.additions = addition;
            } else{
                this.additions = this.additions + ", " + addition;
            }
            this.totalPrice = this.totalPrice + 0.1;
            return "The current additions are: " + this.additions;
        }
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getAdditions() {
        return additions;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getTotalPrice() {
        double additionsPrice = this.additionCount * 0.1;
        double basePrice = (this.totalPrice - additionsPrice);
        return "Base Price = $" + String.format("%.2f", basePrice) + "\n"
                + "Additions price for " + getAdditions() + " = $" + String.format("%.2f", additionsPrice) + "\n"
                + "Total Price = $" + String.format("%.2f", totalPrice);
    }

    public String getName() {
        return name;
    }

    public int getAdditionCount() {
        return additionCount;
    }
}
