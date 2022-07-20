package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
//        Write a method called isPalindrome with one int parameter called number.
//        The method needs to return a boolean.
//         It should return true if the number is a palindrome number otherwise it should return false.
//         Check the tips below for more info about palindromes.
//
        System.out.println("Is 1221 a palindrome: " + isPalindrome(1221));
        System.out.println("Is 3434 a palindrome: " + isPalindrome(3434));
    }
    public static boolean isPalindrome(int number){
        int tempNum = number;
        int reverseNumber = 0;
        while(tempNum > 0){
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + (tempNum % 10);
            tempNum = tempNum/10;
        }
        return reverseNumber == number;
    }
}