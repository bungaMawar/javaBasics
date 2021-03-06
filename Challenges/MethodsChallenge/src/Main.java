public class Main {
    public static void main(String[] args) {
        int score = calculateHighScorePosition(1500);
        System.out.println(displayHighScorePosition("Jack", score));

        score = calculateHighScorePosition(900);
        System.out.println(displayHighScorePosition("Martin", score));

        score = calculateHighScorePosition(400);
        System.out.println(displayHighScorePosition("Tom", score));

        score = calculateHighScorePosition(50);
        System.out.println(displayHighScorePosition("Nick", score));

        score = calculateHighScorePosition(1000);
        System.out.println(displayHighScorePosition("Sam", score));
    }
    public static String displayHighScorePosition(String name, int highScorePosition){
        return name + " managed to get into position " + highScorePosition + " on the high score table.";
    }
    public static int calculateHighScorePosition(int score){
        int position = 4;
        if(score >= 1000){
            //return 1;
            position = 1;
        }
        else if(score >= 500){
            //return 2;
            position = 2;
        }
        else if(score >= 100) {
            //return 3;
            position = 3;
        }
            //return 4;
        return position;
    }
}