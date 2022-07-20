package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
//        What is the perfect number?
//        A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
//        Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
//        For example, take the number 6:
//        Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number,
//        it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.
//
//        Therefore, 6 is a perfect number (as well as the first perfect number).
//
//        Write a method named isPerfectNumber with one parameter of type int named number.
//        If number is < 1, the method should return false.
//        The method must calculate if the number is perfect. If the number is perfect,
//        the method should return true; otherwise, it should return false.
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(45));
    }
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int sum = 0;
        for(int x = 1; x < number; x++){
            if(number % x == 0){
                sum = sum + x;
            }
        }
        if(sum == number){
            return true;
        }
        else{
            return false;
        }
    }
}