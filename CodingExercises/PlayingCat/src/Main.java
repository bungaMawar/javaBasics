public class Main {
    public static void main(String[] args) {
        System.out.println("Cat will play: " + isCatPlaying(true, 10));
        System.out.println("Cat will play: " + isCatPlaying(false, 36));
        System.out.println("Cat will play: " + isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if(temperature <= 45 && temperature >= 25){
                return true;
            }
        }
        else{
            if(temperature <= 35 && temperature >= 25) {
                return true;
            }
        }
        return false;
    }
}