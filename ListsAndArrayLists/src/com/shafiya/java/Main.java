package com.shafiya.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void printInstructions(){
        System.out.println("Press");
        System.out.println("0 - for choice options");
        System.out.println("1 - print list of grocery items");
        System.out.println("2 - add item to list");
        System.out.println("3 - modify an item in list");
        System.out.println("4 - remove item in list");
        System.out.println("5 - search for item in list");
        System.out.println("6 - to quit program");

    }

    public static void addItem(){
        System.out.print("Please add grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter item: ");
        String item = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(item, newItem);
    }

    public static void removeItem(){
        System.out.print("Enter item: ");
        String item = scanner.nextLine();

        groceryList.removeGroceryItem(item);
        System.out.println(item + " removed from grocery list.");
    }

    public static void searchForItem(){
        System.out.print("Enter item: ");
        String item = scanner.nextLine();
        if(groceryList.onFile(item)){
            System.out.println("Found " + item + " in grocery list.");
        } else{
            System.out.println(item + " is not in the grocery list.");
        }
    }
    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}