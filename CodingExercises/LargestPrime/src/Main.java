public class Main {
    public static void main(String[] args) {
//        Write a method named getLargestPrime with one parameter of type int named number.
//        If the number is negative or does not have any prime numbers,
//        the method should return -1 to indicate an invalid value.
//        The method should calculate the largest prime factor of a given number and return it.
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }

        int prime = -1;
        boolean isPrime = true;
        // is it divisible by anythign other than one and itself
        for(int x = 2; x < number; x++){
            if(number % x == 0){
                isPrime = false;
            }
        }
        //if yes then are its dividors primes?
        if (!isPrime){
            for(int x = 1; x < number; x++){//dividing number by everything from one to number - 1 to find dividors
                if(number % x == 0){//is it a dividor
                    boolean isDividorPrime = true;
                    for(int i = 2; i < number/x; i++){//check if the dividors are primes
                        if(number/x % i == 0){//45/9 % 3 == 0
                            isDividorPrime = false;
                            break;
                        }
                    }
                    if(isDividorPrime){//computer please why does 9 pass
                        prime = number/x;
                        break;
                    }
                    else{
                        prime = -1;
                    }
                }
            }
        }
        else{
            return number;
        }
        return prime;
    }
    public static boolean isPrime(int number){
        for(int x = 2; x < number - 1; x++){
            if(number % x == 0) {
                return false;
            }
        }
        return true;
    }
}