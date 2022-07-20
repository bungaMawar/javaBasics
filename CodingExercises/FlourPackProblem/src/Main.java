public class Main {
    public static void main(String[] args) {
//        Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
//        The parameter bigCount represents the count of big flour bags (5 kilos each).
//        The parameter smallCount represents the count of small flour bags (1 kilo each).
//        The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
//        Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
//        The method should return true if it is possible to make a package with goal kilos of flour.
//        If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
//        For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each
//        big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5,
//        the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal,
//        and it's okay if there are additional bags left over.
//        If any of the parameters are negative, return false.
        System.out.println(canPack(1, 0, 6));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(4, 18, 19));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int sum = 0;
        while(bigCount > 0){
            sum += 5;
            bigCount--;
            if(sum > goal){
                sum -= 5;
                break;
            }
        }
        if(sum < goal){
            while(smallCount > 0){
                sum++;
                smallCount--;
                if(sum >= goal){
                    break;
                }
            }
        }

        if(sum == goal){
            return true;
        }
        else{
            return false;
        }
    }
}