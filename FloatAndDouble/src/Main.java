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

        int intVal = 5;
        float floatVal = 5.25f; //most common format
        float secondFloatVal = (float) 5.25;
        double doubleVal = 5.25;
    }
}