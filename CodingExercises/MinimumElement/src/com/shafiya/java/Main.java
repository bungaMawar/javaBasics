package com.shafiya.java;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Write a method called readInteger() that has no parameters and returns an int.
//        It needs to read in an integer from the user - this represents how many elements the user needs to enter.
//        Write another method called readElements() that has one parameter of type int
//        The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
//        And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
//        The scenario is:
//
//        1. readInteger() is called.
//
//        2. The number returned by readInteger() is then used to call readElements().
//
//        3. The array returned from readElements() is used to call findMin().
//
//        4. findMin() returns the minimum number.
//
        System.out.println(findMin(readElements(readInteger())));

    }
    private static int readInteger(){
        return scanner.nextInt();
    }

    private static int[] readElements(int count){
        int[] array = new int[count];
        for(int x = 0; x < count; x++){
            array[x] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int x = 0; x < array.length; x++){
            if(array[x] < min){
                min = array[x];
            }
        }
        return min;
    }
}