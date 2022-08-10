package com.shafiya.java;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> contacts = new ArrayList<>();

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.contacts = new ArrayList<>();
    }
    public boolean addContact(Contacts contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already on file.");
            return false;
        }
        contacts.add(contact);
        return true;
    }
    private int findContact(Contacts searchContact){
        return this.contacts.indexOf(searchContact);
    }
    private int findContact(String contactName){
        for(int x = 0; x < this.contacts.size(); x++){
            Contacts contact = this.contacts.get(x);
            if(contact.getName().equals((contactName))){
                return x;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.contacts.get(position);
        }
        return null;
    }
    public boolean modifyContact(Contacts currentItem, Contacts newItem){
        int position = findContact(currentItem);
        if(position < 0){
            System.out.println(currentItem.getName() + " was not found.");
            return false;
        } else if(findContact(newItem.getName()) != -1){
            System.out.println("Contact with the name " + newItem.getName() + " already exists.");
            return false;
        }
        this.contacts.set(position, newItem);
        System.out.println(currentItem.getName() + " was relpaced with " + newItem.getName());
        return true;
    }
    public boolean removeContact(Contacts contact) {
        int position = findContact(contact);
        if(position < 0){
            System.out.println(contact.getName() + " was not found.");
            return false;
        }

        this.contacts.remove(position);
        System.out.println(contact.getName() + " was deleated.");
        return true;
    }


    public void printContacts(){
        System.out.println("You have " + contacts.size() + " items in your contacts list.");
        for(int x = 0; x < contacts.size(); x++){
            System.out.println((x + 1) + ". " + "Name: " + this.contacts.get(x).getName() +
                                                ", Phone Number: " + contacts.get(x).getPhoneNumber());
        }
    }
}
