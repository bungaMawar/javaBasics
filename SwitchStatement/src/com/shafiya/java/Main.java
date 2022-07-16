package com.shafiya.java;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int value = 1;
        if(value == 1){
            System.out.println("Value was 1");
        }
        else if(value == 2){
            System.out.println("Value was 2");
        }
        else{
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 4;

        switch(switchValue){
            case 1:
                System.out.println("Value was one");
                break;
            case 2:
                System.out.println("Value was two");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a " + switchValue);
                break;
            default:
                System.out.println("Value was neither one, two, three, four, nor five");
                break;
        }

        char switchChar = 'A';

        switch(switchChar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found " + switchChar);
                break;
            default:
                System.out.println(switchChar + " not found");
        }

        String switchMonth = "October";
        switch(switchMonth){
            case "January":
                System.out.println("Jan");
                break;
            case "February":
                System.out.println("Feb");
                break;
            case "October":
                System.out.println("Oct");
                break;
            default:
                System.out.println(switchMonth);
        }

    }
}