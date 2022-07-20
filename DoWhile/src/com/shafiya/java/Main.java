package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        int count = 5;
        while (count != 5){
            System.out.println("Count = " + count);
            count++;
        }
        //won't execute

        count = 0;
        while(true){
            if(count == 5){
                break;
            }
            count++;
            System.out.println("Count = " + count);
        }

        count = 0;
        do{
            System.out.println("Count = " + count);
            count++;
        }while(count != 6);
    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}