package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
//        Create a for statement using a range of numbers from 1 to 1000 inclusive.
//
//                Sum all the numbers that can be divided with both 3 and also with 5.
//
//        For those numbers that met the above conditions, print out the number.
//
//        break out of the loop once you find 5 numbers that met the above conditions.
//
//        After breaking out of the loop print the sum of the numbers that met the above conditions.
//
//                Note: Type all code in main method
        int count = 0;
        int sum = 0;
        for (int x = 0; x <= 1000; x++){
            if(x % 3 == 0 && x % 5 == 0){
                count++;
                sum += x;
                System.out.println("Number " + count + ": " + x);
            }
            if(count == 5){
                break;
            }
        }
        System.out.println("Sum of numbers = " + sum);

    }
}