package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
//        Write a method called numberToWords with one int parameter named number.
//        The method should print out the passed number using words for the digits.
//        If the number is negative, print "Invalid Value".
//                To print the number as words, follow these steps:
//        1. Extract the last digit of the given number using the remainder operator.
//        2. Convert the value of the digit found in Step 1 into a word. There are 10 possible values for that digit, those being 0, 1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero" if the digit is 0, "One" if the digit is 1, and so on.
//        3. Remove the last digit from the number.
//        4. Repeat Steps 2 through 4 until the number is 0.
//      HINT: Use a for loop to print zeroes after reversing the number. As seen in a previous example,
//      100 reversed becomes 1, but the method numberToWords should print "One Zero Zero".
//      To get the number of zeroes, check the difference between the digit count from the original number
//      and the reversed number.
//
        System.out.println(getDigitCount(100));
        System.out.println(reverse(7382));
        numberToWords(132);
        numberToWords(1000);
    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Number");
        }
        else{
            int originalCount = getDigitCount(number);
            int count = 0;
            number = reverse(number);
            while (number > 0){
                int remainder = number % 10;
                number = number/10;
                count++;
                switch (remainder){
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EIGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;
                    case 0:
                        System.out.println("ZERO");
                        break;
                }
            }
            if (count != originalCount){
                for(int x = 0; x < originalCount - count; x++){
                    System.out.println("ZERO");
                }
            }
        }
    }

    public static int reverse(int number){
        int negative = 0;
        if(number < 0){
            negative = Math.abs(number);
            number = Math.abs(number);
        }
        int returnNumber = 0;
        while(number > 0){
            returnNumber = (returnNumber * 10) + (number % 10);
            number = number/10;
        }
        if(negative != 0){
            returnNumber = -returnNumber;
        }
        return returnNumber;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        int count = 0;
        do{
            number = number/10;
            count++;
        }while(number > 0);
        return count;
    }
}