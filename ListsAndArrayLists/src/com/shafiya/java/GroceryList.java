package com.shafiya.java;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int x = 0; x < groceryList.size(); x++){
            System.out.println((x + 1) + ". " + groceryList.get(x));
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        groceryList.remove(position);
    }
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem((searchItem));
        if(position >= 0){
            return true;
        }
        return false;
    }
}
