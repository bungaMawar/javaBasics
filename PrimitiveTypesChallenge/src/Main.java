public class Main {
    public static void main(String[] args) {
        byte challByteVal = 100;
        short challShortVal = 30000;
        int challIntVal = 2000000;
        long challLongVal = 50000 + (10 * (challByteVal + challShortVal + challIntVal));

        System.out.println(challLongVal);
    }
}