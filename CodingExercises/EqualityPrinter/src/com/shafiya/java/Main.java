package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        printEqual(2, 2, 2);
        printEqual(3, 2, 3);
        printEqual(3, 2, 5);
        printEqual(-2, 3, 4);
    }
    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber){
        if(firstNumber < 0 || secondNumber < 0 || thirdNumber < 0){
            System.out.println("Invalid Value");
        }
        else if(firstNumber == thirdNumber && secondNumber == thirdNumber){
            System.out.println("All numbers are equal");
        }
        else if(firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }
}