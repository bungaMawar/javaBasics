package com.shafiya.java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Fiya", 394.90);
        Customer anotherCustomer;

        anotherCustomer = customer;

        anotherCustomer.setBalance(12.49);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int x = 0; x < intList.size(); x++){
            System.out.println((x + 1) + ") " + intList.get(x));
        }

        intList.add(1, 2);

        for(int x = 0; x < intList.size(); x++){
            System.out.println(x + ") " + intList.get(x));
        }
    }
}