package com.shafiya.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year of birth: " );
        int yearOfBirth = scanner.nextInt();

        scanner.nextLine(); //this is necessary so scanner works as expected; handle next line character(enter key)

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2022 - yearOfBirth;

        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        scanner.close();
    }
}