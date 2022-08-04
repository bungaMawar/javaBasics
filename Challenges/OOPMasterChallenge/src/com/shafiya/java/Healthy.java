package com.shafiya.java;

public class Healthy extends Hamburger{
    private String breadRollType;
    private String additions;
    private String meatType;
    private double totalPrice;
    private String name;
    private int additionCount;
    public Healthy(String meatType) {
        super("Healthy", "Brown Rye", meatType);
        this.totalPrice = 5.50;
        this.additions = "None";
        this.additionCount = 0;
    }

    @Override
    public String addAdditions(String addition) {
        if(additionCount >= 6){
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

    @Override
    public String getBreadRollType() {
        return breadRollType;
    }

    @Override
    public String getAdditions() {
        return additions;
    }

    @Override
    public String getMeatType() {
        return meatType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAdditionCount() {
        return additionCount;
    }

    @Override
    public String getTotalPrice() {
        return super.getTotalPrice();
    }
}
