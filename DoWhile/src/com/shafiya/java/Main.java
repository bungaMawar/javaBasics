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

        int number = 4;
        int endNumber = 20;
        while(number <= endNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
                //like break, but doesn't end the loop
                //just bypasses everything after this and
                //goes back to beginning
            }
            System.out.println("Even number: " + number);
        }
    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}