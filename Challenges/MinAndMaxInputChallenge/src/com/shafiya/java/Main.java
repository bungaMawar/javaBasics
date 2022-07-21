package com.shafiya.java;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        -Read the numbers from the console entered by the user and print the minimum and maximum number
//        the user has entered.
//        -Before the user enters the number, print the message ÅgEnter number:Åh
//                -If the user enters an invalid number, break out of the loop and print the minimum
//                and maximum number.
//
//        Hint:
//        -Use an endless while loop.
//
//                Bonus:
//        -Create a project with the name MinAndMaxInputChallenge.

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(true){
            System.out.print("Enter Number: ");
            if(scanner.hasNextInt()){
                int input = scanner.nextInt();
                if(input < min){
                    min = input;
                }
                else if (input > max){
                    max = input;
                }
            }
            else{
                break;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        scanner.close();
    }
}