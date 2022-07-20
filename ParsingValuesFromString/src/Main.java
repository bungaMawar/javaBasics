public class Main {
    public static void main(String[] args) {
        String numberAsString = "2022";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        //Integer.parseInt("123r") <-- produces error
        String doubleAsString = "2022.3924";
        double doubleNumber = Double.parseDouble(doubleAsString);
        System.out.printf("doubleNumber = " + doubleNumber);
    }
}