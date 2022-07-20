package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
//        Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//        If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
//        The method should return the greatest common divisor of the two numbers (int).
//        The greatest common divisor is the largest positive integer that can fully divide each of
//        the integers (i.e. without leaving a remainder).
//        For example 12 and 30:
//        12 can be divided by 1, 2, 3, 4, 6, 12
//        30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
//        The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
//        and there is no resulting remainder.
        System.out.println(getGreatestCommonDivisor(12, 30));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int gcd = -1;
        for(int x = 1; x <= first; x++){
            if(first % x == 0){
                for(int y = 1; y <= second; y++){
                    if(second % y == 0){
                        if(first/x == second/y){
                            if(gcd < first/x){
                                gcd = first/x;
                            }
                        }
                    }
                }
            }
        }
        return gcd;
    }
}