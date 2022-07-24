package com.shafiya.java;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void withdraw(int amount){
        if(balance < amount){
            System.out.println("Insufficient Funds");
        }
        else {
            balance = balance - amount;
            System.out.println("Current balance: " + balance);
        }
    }
    public void deposit(int amount){
        balance = balance + amount;
        System.out.println("Current balance: " + balance);
    }
}
