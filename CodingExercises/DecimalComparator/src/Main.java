public class Main {
    public static void main(String[] args) {
        double firstNumber = 3.1756;
        double secondNumber = 3.175;
        System.out.println(firstNumber + " and " + secondNumber +
                " are equal up to three decimal places: " +
                areEqualByThreeDecimalPlaces(firstNumber, secondNumber));

        firstNumber = 0d;
        secondNumber = 0d;
        System.out.println(firstNumber + " and " + secondNumber +
                " are equal up to three decimal places: " +
                areEqualByThreeDecimalPlaces(firstNumber, secondNumber));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        if(firstNumber == 0d && secondNumber == 0d){
            return true;
        }
        double scale = Math.pow(firstNumber, 3);
        firstNumber = Math.round(firstNumber * scale)/scale;
        secondNumber = Math.round(secondNumber * scale)/scale;

        if(firstNumber == secondNumber){
            return true;
        }
        return false;
    }
}