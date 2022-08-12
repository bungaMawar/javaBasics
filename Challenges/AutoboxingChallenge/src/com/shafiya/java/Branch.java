package com.shafiya.java;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customerList;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public boolean addCustomer(String customerName, double initialAmount){
        if(searchCustomer(customerName) == null){
            this.customerList.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(double transactionAmount, String name){
        Customer existingCustomer = searchCustomer(name);
        if(existingCustomer != null){
            existingCustomer.addTransaction(transactionAmount);
            return true;
        }
        return false;
    }
    private Customer searchCustomer(String name){
        for (int x = 0; x < this.customerList.size(); x++){
            Customer customer = this.customerList.get(x);
            if(customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }
}
