package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
//        Write a method named hasSharedDigit with two parameters of type int.
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive).
//        If one of the numbers is not within the range, the method should return false.
//        The method should return true if there is a digit that appears in both numbers,
//        such as 2 in 12 and 23; otherwise, the method should return false.
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(17, 25));

    }
    public static boolean hasSharedDigit(int first, int second){
        if(first < 10 || first > 99 || second < 10 || second > 99){
            return false;
        }
        int numberOne = 0;
        int numberTwo = 0;
        while(first > 0){
            numberOne = first % 10;
            while(second > 0) {
                numberTwo = second % 10;
                if (numberOne == numberTwo) {
                    return true;
                }
                second = second / 10;
            }
            first = first/10;
        }
        return false;
    }
}