public class Main {
    public static void main(String[] args) {
//        Write a method named getLargestPrime with one parameter of type int named number.
//        If the number is negative or does not have any prime numbers,
//        the method should return -1 to indicate an invalid value.
//        The method should calculate the largest prime factor of a given number and return it.
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(7));
        System.out.println(isPrime(7));
        System.out.println(isPrime(24));
    }
    public static int getLargestPrime(int number){
        if(number < 0){
            return -1;
        }
        int prime = -1;
        for(int x = 2; x < number; x++){
            if(number % x == 0){
                for(int i = 1; i < number/x; i++){
                    if(!((number/x) % i == 0) && number/x > prime){
                        prime = number/x;
                    }
                }
            }
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