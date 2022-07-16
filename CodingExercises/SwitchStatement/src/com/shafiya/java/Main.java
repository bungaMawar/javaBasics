package com.shafiya.java;
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
    }
}