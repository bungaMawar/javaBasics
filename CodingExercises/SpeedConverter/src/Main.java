public class Main {
    public static void main(String[] args) {
        printConversion(17.21);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long milesPerHour = -1;
        if(kilometersPerHour >= 0){
            milesPerHour = Math.round(kilometersPerHour/1.609);
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour == -1){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}