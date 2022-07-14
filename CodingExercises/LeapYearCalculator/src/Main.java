public class Main {
    public static void main(String[] args) {
        int year = 2004;
        System.out.println(year + " is a leap year: " + isLeapYear(year));

        year = 1700;
        System.out.println(year + " is a leap year: " + isLeapYear(year));
    }
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        else{
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else{
                    return true;
                }
            }
            else{
                return false;
            }
        }
    }
}