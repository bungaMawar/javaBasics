package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("American");

        bank.addBranch("Ohio");

        bank.addNewCustomer("Ohio", "Fiya", 4232.39);
        bank.addNewCustomer("Ohio", "Zaid", 3845.23);
        bank.addNewCustomer("Ohio", "Dija", 3945.50);

        bank.addBranch("Virginia");
        bank.addNewCustomer("Virginia", "Hasa", 3948.39);

        bank.addCustomerTransaction("Ohio", "Fiya", 34.92);
        bank.addCustomerTransaction("Ohio", "Dija", 48.20);

        if(!bank.addNewCustomer("Ohio", "Fiya", 384.49)){
            System.out.println("Customer already exists");
        }
        if(!bank.addNewCustomer("Alabama", "Via", 39.30)){
            System.out.println("Alabama branch does not exist");
        }
        if(!bank.addBranch("Virginia")){
            System.out.println("Virginia branch already exists");
        }

        bank.listCustomers("Ohio", true);
        bank.listCustomers("Virginia", true);
    }
}