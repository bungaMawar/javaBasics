public class Main {
    public static void main(String[] args) {

        float minFloatVal = Float.MIN_VALUE;
        float maxFloatVal = Float.MAX_VALUE;
        System.out.println("Minimum float value is " + minFloatVal);
        System.out.println("Maximum float value is " + maxFloatVal);

        double minDoubleVal = Double.MIN_VALUE;
        double maxDoubleVal = Double.MAX_VALUE;
        System.out.println("Minimum double value is " + minDoubleVal);
        System.out.println("Maximum double value is " + maxDoubleVal);

        int intVal = 5 / 3 ;
        float floatVal = 5f / 3f; //most common format
        float secondFloatVal = (float) 5.25;
        double doubleVal = 5.00 / 3.00;

        System.out.println("Integer: " + intVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Double: " + doubleVal);

        double pi = 3.1415927d;
        double number = 3_000_000.4_235_235d;

        System.out.println(pi);
        System.out.println(number);
    }
}