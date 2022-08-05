public class Main {
    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.
        int[] array = {34, 123, 1244, 131, 2, 53};
        printArray(sortIntegers(array));
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = array;
        int largestNumber = 0;
        int index = 0;

        for(int x = 0; x < sortedArray.length; x++){
            for(int i = x; i < sortedArray.length; i++){
                if(largestNumber < sortedArray[i]){
                    largestNumber = sortedArray[i];
                    index = i;
                }
            }
            int tempNum = sortedArray[x];
            sortedArray[x] = largestNumber;
            sortedArray[index] = tempNum;
            largestNumber = 0;
        }
        return sortedArray;
    }

    public static void printArray(int[] array){
        for(int x = 0; x < array.length; x++){
            System.out.println("Element #" + x + ": " + array[x]);
        }
    }
}