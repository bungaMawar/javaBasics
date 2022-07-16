package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest: " +  calculateInterest(10000, 2));
        System.out.println("10,000 at 3% interest: " +  calculateInterest(10000, 3));
        System.out.println("10,000 at 4% interest: " +  calculateInterest(10000, 4));
        System.out.println("10,000 at 5% interest: " +  calculateInterest(10000, 5));

        for(int i = 0; i < 5; i++){
            System.out.println("Loop: " + i);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }
}