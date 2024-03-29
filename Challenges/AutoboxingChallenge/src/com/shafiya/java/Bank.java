package com.shafiya.java;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if (findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addNewCustomer(String branchName, String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomer(customerName, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addTransaction(transactionAmount, customerName);
        }
        return false;
    }
    private Branch findBranch(String branchName){
        for(int x = 0; x < branches.size(); x++){
            Branch branch = this.branches.get(x);
            if(branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if (branch != null){
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomerList();
            for(int x = 0; x < branchCustomers.size(); x++){
                Customer customer = branchCustomers.get(x);
                System.out.println("Customer: " + customer.getName() + " [" + (x + 1) + "]");
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();

                    for(int i = 0; i < transactions.size(); i++){
                        System.out.println("[" + (i + 1) + "] Amount: " + transactions.get(i));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
