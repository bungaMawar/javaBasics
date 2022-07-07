public class Main {
    public static void main(String[] args) {
        byte byteVal = 100;
        short shortVal = 30000;
        int intVal = 2000000;
        long LongVal = 50000 + (10 * (byteVal + shortVal + intVal));

        System.out.println(LongVal);
    }
}