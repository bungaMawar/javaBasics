package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
//        Write a method named getEvenDigitSum with one parameter of type int called number.
//        The method should return the sum of the even digits within the number.
//        If the number is negative, the method should return -1 to indicate an invalid value.
        System.out.println(getEvenDigitSum(1234));
        System.out.println(getEvenDigitSum(-123));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int evenSum = 0;
        int tempNumber = 0;
        while(number > 0){
            tempNumber = number % 10;
            number = number/10;
            if(tempNumber % 2 == 0){
                evenSum = evenSum + tempNumber;
            }
        }
        return evenSum;
    }
}