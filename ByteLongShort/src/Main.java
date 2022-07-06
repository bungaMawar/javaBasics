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

        byte minByteVal = Byte.MIN_VALUE;
        byte maxByteVal = Byte.MAX_VALUE;
        System.out.println("Minimum value of byte is " + minByteVal);
        System.out.println("Maximum value of byte is " + maxByteVal);

        short minShortVal = Short.MIN_VALUE;
        short maxShortVal = Short.MAX_VALUE;
        System.out.println("Minimum value of short is " + minShortVal);
        System.out.println("Maximum value of short is " + maxShortVal);

        long longVal = 100L;
        long minLongVal = Long.MIN_VALUE;
        long maxLongVal = Long.MAX_VALUE;
        System.out.println("Minimum value of long is " + minLongVal);
        System.out.println("Maximum value of long is " + maxLongVal);
        long longLiteralVal = 2_147_483_649L;
        System.out.println(longLiteralVal);
    }
}