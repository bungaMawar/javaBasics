package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        for(int i = 2; i <= 8; i++){
            System.out.println("10,000 at " + i + "% interest: " +  String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("---------");
        for(int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + "% interest: " +  String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println("----------");
        int numberOfPrimes = 0;
        for(int x = 0; x < 10; x++){
            if(isPrime(x)){
                numberOfPrimes++;
                System.out.println("Prime Number: " + x + "\nNumber of primes: " + numberOfPrimes);
                if (numberOfPrimes == 3){
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i ++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate/100);
    }
}