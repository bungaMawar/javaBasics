public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            int megaBytes = kiloBytes/1000;
            int remainder = kiloBytes % 1000;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}