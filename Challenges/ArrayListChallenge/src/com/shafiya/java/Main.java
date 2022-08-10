package com.shafiya.java;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone phone = new MobilePhone("123 456 7890");
    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities.
        // Able to store, modify, remove and query contact names.
        // You will want to create a separate class for Contacts (name and phone number).
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above.
        // Add a menu of options that are available.
        // Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact.
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the Arraylist to MobilePhone
        // e.g. no ints, no .get(i) etc
        // MobilePhone should do everything with Contact objects only.
        boolean quit = false;
        int choice = 0;
        startPhone();
        choiceInformation();
        while(!quit){
            System.out.println("Enter 6 for action list.");
            System.out.print("Enter a number: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    System.out.println("Shutting down.");
                    quit = true;
                    break;
                case 1:
                    phone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeExistingContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    choiceInformation();
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
    public static void choiceInformation(){
        System.out.println("Press");
        System.out.println("0 - shutdown");
        System.out.println("1 - print contacts");
        System.out.println("2 - add item to list");
        System.out.println("3 - modify an item in list");
        System.out.println("4 - remove item in list");
        System.out.println("5 - search for item in list");
        System.out.println("6 - print instructions");
        System.out.print("Enter a number: ");
    }
    private static void addNewContact(){
        System.out.print("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String phoneNumber = scanner.nextLine();

        Contacts newContact = Contacts.createContact(name, phoneNumber);

        if(phone.addContact(newContact)){
            System.out.println("New contact, " + name + ", " + phoneNumber + " successfully added.");
        } else{
            System.out.println(name + " is already on file.");
        }
    }

    private static void updateContact(){
        System.out.print("Enter current contact name: ");
        String oldName = scanner.nextLine();

        Contacts oldContact = phone.queryContact(oldName);
        if(oldContact == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newPhoneNumber = scanner.nextLine();

        Contacts newContact = Contacts.createContact(newName, newPhoneNumber);
        if(phone.modifyContact(oldContact, newContact)){
            System.out.println("Update Successful.");
        } else {
            System.out.println("Error updating.");
        }
    }

    private static void removeExistingContact(){
        System.out.print("Enter current contact name: ");
        String oldName = scanner.nextLine();
        Contacts oldContact = phone.queryContact(oldName);
        if(oldContact == null){
            System.out.println("Contact not found.");
            return;
        }

        if(phone.removeContact(oldContact)){
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error deleting.");
        }
    }

    private static void findContact(){
        System.out.print("Enter current contact name: ");
        String oldName = scanner.nextLine();
        Contacts oldContact = phone.queryContact(oldName);
        if(oldContact == null){
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + oldContact.getName() + " phone number is " + oldContact.getPhoneNumber());
    }

    private static void startPhone(){
        System.out.println("Starting phone...");
    }
}