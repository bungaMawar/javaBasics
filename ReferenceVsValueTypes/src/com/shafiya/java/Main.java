package com.shafiya.java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int intValue = 10;
        int otherIntValue = intValue;
        System.out.println("intValue = " + intValue);
        System.out.println("otherIntValue = " + otherIntValue);

        otherIntValue++;

        System.out.println("intValue = " + intValue);
        System.out.println("otherIntValue = " + otherIntValue);

        int[] intArray = new int[5];
        int[] otherIntArray = intArray;

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("otherIntArray = " + Arrays.toString(otherIntArray));

        otherIntArray[0] = 1;

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("otherIntArray = " + Arrays.toString(otherIntArray));

        modifyArray(intArray);

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("otherIntArray = " + Arrays.toString(otherIntArray));

    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}