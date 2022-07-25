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
        BankAccount bankAccount = new BankAccount(134235, 500, "Shafiya", "fiya@gmail.com", "234-039-2123");

        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Balance: " + bankAccount.getBalance());
        System.out.println("Email: " + bankAccount.getEmail());
        System.out.println("Name: " + bankAccount.getName());
        System.out.println("Phone Number: " + bankAccount.getPhoneNumber());

        bankAccount.withdraw(50);
        bankAccount.withdraw(100);
        bankAccount.deposit(1000);

        BankAccount newAccount = new BankAccount();
        System.out.println("Account Number: " + newAccount.getAccountNumber());
        System.out.println("Balance: " + newAccount.getBalance());
        System.out.println("Email: " + newAccount.getEmail());
        System.out.println("Name: " + newAccount.getName());
        System.out.println("Phone Number: " + newAccount.getPhoneNumber());

        BankAccount fiyaAccount = new BankAccount("Fiya", "fiya@gmail.com", "1234567890");
        System.out.println("Account Number: " + fiyaAccount.getAccountNumber());
        System.out.println("Balance: " + fiyaAccount.getBalance());
        System.out.println("Email: " + fiyaAccount.getEmail());
        System.out.println("Name: " + fiyaAccount.getName());
        System.out.println("Phone Number: " + fiyaAccount.getPhoneNumber());

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VIPCustomer defaultCustomer = new VIPCustomer();
        VIPCustomer namedCustoemer = new VIPCustomer("John", "john@email.com");
        VIPCustomer customer = new VIPCustomer("Emma", "emma@email.com", 50000);
        System.out.println("Name: " + defaultCustomer.getName());
        System.out.println("Email: " + defaultCustomer.getEmail());
        System.out.println("Credit Limit: $" + defaultCustomer.getCreditLimit());
        System.out.println("=========");
        System.out.println("Name: " + namedCustoemer.getName());
        System.out.println("Email: " + namedCustoemer.getEmail());
        System.out.println("Credit Limit: $" + namedCustoemer.getCreditLimit());
        System.out.println("=========");
        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Credit Limit: $" + customer.getCreditLimit());

    }
}