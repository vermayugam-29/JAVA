import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//number of stairs
    }
    static int noOfWays(int n){
        if(n < 0) return 0; //because we cannot have a stairs as negative so when n become negative just return 0

        if(n == 0) return 1;//this means we have successfully reached our stairs


        //we have two ways of climbing stairs either take 2steps or take 1step and we because we start from to reach 0th
        return noOfWays(n-2) + noOfWays(n-1);
    }

}
