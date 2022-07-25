package com.shafiya.java;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(12345, 100, "Default Name", "Default Email", "Default PPhone");
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this(12345, 100, name, email, phoneNumber);
    }

    public BankAccount(int accountNumber, double balance, String name, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
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
    public void setPhoneNumber(String phoneNumber){
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
    public String getPhoneNumber(){
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
