package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(12345678);
        bankAccount.setBalance(100);
        bankAccount.setEmail("fiya@gmail.com");
        bankAccount.setName("Fiya");
        bankAccount.setPhoneNumber(323940123);

        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: " + bankAccount.getBalance());
        System.out.println("Email: " + bankAccount.getEmail());
        System.out.println("Name: " + bankAccount.getName());
        System.out.println("Phone Number: " + bankAccount.getPhoneNumber());

        bankAccount.withdraw(50);
        bankAccount.withdraw(100);
        bankAccount.deposit(1000);
    }
}