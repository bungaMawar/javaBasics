public class Main {
    public static void main(String[] args) {
        String stringVal = "My string";
        System.out.println("stringVal is equal to " + stringVal);
        stringVal = stringVal + ". Addition to my string";
        System.out.println(stringVal);
        stringVal = stringVal + "\u00A9 2022";
        System.out.println(stringVal);

        String number = "250.55";
        number = number + "450.56";
        System.out.println(number);

        String addedNumber = "50";
        int numberToAdd = 10;
        addedNumber = addedNumber + numberToAdd;
        System.out.println("Numbers added is " + addedNumber);

        double anotherNumberToAdd = 123.54d;
        addedNumber = addedNumber + anotherNumberToAdd;
        System.out.println("Added double: " + addedNumber);
    }
}