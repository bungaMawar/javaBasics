package com.shafiya.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year of birth: " );

        boolean hasNextInt = scanner.hasNextInt();//checks if the input is an int
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //this is necessary so scanner works as expected; handle next line character(enter key)

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        }
        else{
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }
}