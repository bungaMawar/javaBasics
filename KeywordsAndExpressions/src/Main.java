public class Main {
    public static void main(String[] args) {
        //1 mi = 1.609344 km
        double kilometers = 100 * 1.609344;

        int highScore = 100;

        if (highScore == 50){
            System.out.println("This is an expression.");
        }

        int score = 100; //score = 100 is an expression
        if (score > 99){ //score > 99 is an expression
            System.out.println("You got the high score!"); //"You got the high score!" is an expression
            score = 0; //this whole thing is also an expression
        }
    }
}