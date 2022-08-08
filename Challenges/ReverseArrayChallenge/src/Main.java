import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        -Write a method called reverse() with an int array as a parameter.
//        -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
//
        int[] intArray = {1, 2, 3, 4, 5};
        reverse(intArray);
        System.out.println("Reversed array: " + Arrays.toString(intArray));
    }
    private static void reverse(int[] array){
        int[] tempArray = new int[array.length];
        for(int x = 0; x < array.length; x++){
            tempArray[x] = array[x];
        }

        for(int x = array.length - 1; x >= 0; x--){
            array[x] = tempArray[(array.length - 1) - x];
        }
    }
}