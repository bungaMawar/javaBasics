package com.shafiya.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//        The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
//        When the user enters something that is not an int then it needs to print a message in the format
//        "SUM = XX AVG = YY".
//         XX represents the sum of all entered numbers of type int.
//         YY represents the calculated average of all numbers of type long.
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int average = 0;
        while(true){
            if(scanner.hasNextInt()){
                count++;
                int input = scanner.nextInt();
                sum = sum + input;
                double numberRounded = (double) sum/ (double) count;
                average = (int)Math.round(numberRounded);
                scanner.nextLine();
            }
            else{
                break;
            }
        }
        System.out.print("SUM = " + sum);
        System.out.println(" AVG = " + average);
        scanner.close();
    }
}