public class Main {
    public static void main(String[] args) {
        double firstVal = 20.00;
        double secondVal = 80.00;
        double firstExpression = (firstVal + secondVal) * 100.00;

        double remainder = firstExpression % 40.00;

        boolean isZero = false;
        if(remainder == 0){
            isZero = true;
        }
        else{
            isZero = false;
        }

        System.out.println(isZero);

        if(!isZero){
            System.out.println("Got some remainder");
        }
    }
}