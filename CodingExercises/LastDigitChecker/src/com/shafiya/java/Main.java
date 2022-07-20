package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
//        Write a method named hasSameLastDigit with three parameters of type int.
//        Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
//        If one of the numbers is not within the range, the method should return false.
//        The method should return true if at least two of the numbers share the same rightmost digit;
//        otherwise, it should return false.
//
//        Write another method named isValid with one parameter of type int.
//        The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive),
//        otherwise return false.
        System.out.println(hasSameLastDigit(12, 23, 56));
        System.out.println(hasSameLastDigit(23, 13, 64));
    }
    public static boolean hasSameLastDigit(int first, int second, int third){
        if(!isValid(first) || !isValid(second) || !isValid(third)){
            return false;
        }
        if(first % 10 == second % 10 || first % 10 == third % 10 || second % 10 == third % 10){
            return true;
        }
        return false;
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}