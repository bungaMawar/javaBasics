public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(102, 3));
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 && (seconds < 0 || seconds > 59)){
            return "Invalid value";
        }
        int hours = minutes/60;
        minutes = minutes % 60;

        return hours + "h " + minutes + "m " + seconds + "s";
    }
}