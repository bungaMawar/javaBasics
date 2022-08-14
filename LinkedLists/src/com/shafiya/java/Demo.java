package com.shafiya.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder("Italy", placesToVisit);
        addInOrder("Germany", placesToVisit);
        addInOrder("Canada", placesToVisit);
        addInOrder("Sydney", placesToVisit);
        addInOrder("Bali", placesToVisit);
        addInOrder("Jakarta", placesToVisit);

        printList(placesToVisit);

        addInOrder("Jakarta", placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Current destination: " + i.next());
        }
        System.out.println("--------------");
    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedList){
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println(newCity + " is already in the list.");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = false;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itenerary.");
        } else{
            System.out.println("Current destination " + listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Vacay over!");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Current destination: " + listIterator.next());
                    } else {
                        System.out.println("Reached end of list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Current destination: " + listIterator.previous());
                    } else{
                        System.out.println("Beginning of list.");
                        goingForward = true; 
                    }
                    break;
                case 3:
                    printMenu();
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
    private static void printMenu(){
        System.out.println("OPTIONS");
        System.out.println("0 - quit");
        System.out.println("1 - go to next location");
        System.out.println("2 - go to previous location");
        System.out.println("3 - list options");
    }
}
