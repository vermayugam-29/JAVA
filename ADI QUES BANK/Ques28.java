import java.util.Map;
import java.util.Scanner;
//KNAPSACK PROBLEM
public class Ques28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] money = {60,100,120};
        int[] weight = {10,20,30};
        System.out.println(solve(money,weight,n));

    }
    static double  solve(int[] money,int[] weight,int maxW){
        int currW = 0;
        double ans = 0;

        for(int i=0;i<3;i++){
            if(currW + weight[i] <= maxW){
                currW += weight[i];
                ans += (double) money[i];
            }
            else{
                int remainW = maxW - currW;
                double profit = ((double)money[i] / (double) weight[i] ) * remainW;
                ans += profit;

                break;
            }
        }
        return ans;
    }
}
