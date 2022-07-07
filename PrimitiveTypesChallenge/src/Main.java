public class Main {
    public static void main(String[] args) {
        byte byteVal = 100;
        short shortVal = 30000;
        int intVal = 2000000;
        long longVal = 50000L + (10 * (byteVal + shortVal + intVal));

        System.out.println(longVal);
    }
}