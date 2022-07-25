package com.shafiya.java;

public class VIPCustomer {
    private int creditLimit;
    private String name;
    private String email;

    public VIPCustomer() {
        this("Default Name", "Default Email", 1000);
    }

    public VIPCustomer(String name, String email) {
        this(name, email, 1000);
    }
    public VIPCustomer(String name, String email, int creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }
}
