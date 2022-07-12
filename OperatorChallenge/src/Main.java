public class Main {
    public static void main(String[] args) {
        double firstVal = 20.00;
        double secondVal = 80.00;
        double firstExpression = (firstVal + secondVal) * 100.00;

        double remainder = firstExpression % 40.00;

        boolean isZero = remainder == 0 ? true : false;
        System.out.println("The expression has no remainder: " + isZero);
    }
}