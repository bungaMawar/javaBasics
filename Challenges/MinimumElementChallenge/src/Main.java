import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//                -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//                -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//                -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//                -Finally, print the minimum element in the array.
//
        System.out.println(findMin(readIntegers(5)));
    }
    private static int[] readIntegers(int count){
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[count];

        for(int x = 0; x < count; x++){
            System.out.print("Enter integer #" + (x + 1) + ": ");
            int number = scanner.nextInt();
            array[x] = number;
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int x = 0; x < array.length; x++){
            if(array[x] < min){
                min = array[x];
            }
        }
        return min;
    }
}