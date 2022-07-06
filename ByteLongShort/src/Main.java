public class Main {
    public static void main(String[] args) {

        int value = 10000;
        int minIntVal = Integer.MIN_VALUE;
        int maxIntVal = Integer.MAX_VALUE;
        System.out.println("Minimum value of integer is " + minIntVal);
        System.out.println("Maximum value of integer is " + maxIntVal);
        System.out.println("Busted int max value: " + (maxIntVal + 1));
        System.out.println("Busted int min value: " + (minIntVal - 1));

        int maxIntTest = 2_147_483_647;
    }
}