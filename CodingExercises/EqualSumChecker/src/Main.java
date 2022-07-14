public class Main {
    public static void main(String[] args) {
        System.out.println("1 + 1 = 1: " + hasEqualSum(1, 1, 1));
        System.out.println("1 + (-1) = 0: " + hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int sum){
        if(firstNumber + secondNumber == sum){
            return true;
        }
        return false;
    }
}