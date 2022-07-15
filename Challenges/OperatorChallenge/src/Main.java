public class Main {
    public static void main(String[] args) {
        double firstVal = 20.00;
        double secondVal = 80.00;
        double firstExpression = (firstVal + secondVal) * 100.00;
        System.out.println("Result: " + firstExpression);

        double remainder = firstExpression % 40.00;
        System.out.println("Remainder: " + remainder);

        boolean isZero = remainder == 0 ? true : false;
        if(!isZero){
            System.out.println("Got some remainder");
        }
    }
}