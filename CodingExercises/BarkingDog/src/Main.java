public class Main {
    public static void main(String[] args) {
        boolean wakeUp = shouldWakeUp(true, 8);
        System.out.println("wakeUp is " + wakeUp);

        wakeUp = shouldWakeUp(false, 2);
        System.out.println("wakeUp is " + wakeUp);

        wakeUp = shouldWakeUp(true, 1);
        System.out.println("wakeUp is " + wakeUp);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean wakeUp = false;
        if(hourOfDay < 0 || hourOfDay > 23){
            return wakeUp;
        }
        if(barking == false){
            wakeUp = false;
        }
        else{
            if(hourOfDay < 8 || hourOfDay > 22){
                wakeUp = true;
            }
        }
        return wakeUp;
    }
}