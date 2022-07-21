package com.shafiya.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        -Read 10 numbers from the console entered by the user and print the sum of those numbers.
//                -Create a Scanner like we did in the previous video.
//                -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
//        -If hasNextInt() returns false, print the message ÅgInvalid NumberÅh. Continue reading until you have
//        read 10 numbers.
//                -Use the nextInt() method to get the number and add it to the sum.
//                -Before the user enters each number, print the message ÅgEnter number #x:Åh where
//                x represents the count, i.e. 1, 2, 3, 4, etc.
//                -For example, the first message printed to the user would be ÅgEnter number #1:Åh,
//                the next ÅgEnter number #2: Åh, and so on.
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int input = 0;
        while(count <= 10){
            System.out.print("Enter number #" + count + ": ");
            if(scanner.hasNextInt()){
                input = scanner.nextInt();
                sum += input;
                count++;
            }
            else{
                System.out.println("Invalid Value.");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum of numbers = " + sum);
    }
}