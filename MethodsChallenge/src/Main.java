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
    }
    public static String displayHighScorePosition(String name, int highScorPosition){
        return name + " managed to get into position " + highScorPosition + " on the high score table.";
    }
    public static int calculateHighScorePosition(int score){
        if(score > 1000){
            return 1;
        }
        else if(score > 500 && score < 1000){
            return 2;
        }
        else if(score > 100 && score < 500){
            return 3;
        }
        else {
            return 4;
        }
    }
}