package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
//        Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//        The method needs to find the first and the last digit of the parameter number passed to the method,
//        using a loop and return the sum of the first and the last digit of that number.
//        If the number is negative then the method needs to return -1 to indicate an invalid value.
//
        System.out.println(sumFirstAndLastDigit(1235));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int last = number % 10;
        int first = 0;
        while(number > 0){
            first = number % 10;
            number = number/10;
        }
        return last + first;
    }
}