package com.shafiya.java;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] inputIntegers = getIntegers(5);
        for (int x = 0; x < inputIntegers.length; x++){
            System.out.println("Element #" + x + ": " + inputIntegers[x]);
        }

        System.out.println("Average of array: " + getAverage(inputIntegers));
//        int variable = 50;
//        int[] array = new int[10];
//        array[5] = 50;
//        System.out.println(array[5]);
//
//        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(intArray[1]);
//        System.out.println(intArray[4]);
//
//        int[] thirdIntArray = new int[10];
//        printArray(thirdIntArray);
//
    }
//
//    public static void printArray(int[] array){
//        for(int i = 0; i < array.length; i++){
//            array[i] = i * 10;
//            System.out.println("Element #" + i + ": " + array[i]);
//        }
//    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int x = 0; x < values.length; x++){
            values[x] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int x = 0; x < array.length; x++){
            sum += array[x];
        }
        return (double) sum / (double) array.length;
    }
}