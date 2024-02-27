import java.util.Arrays;
import java.util.Scanner;

public class O1Knapsack {
    static int[][] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        int maxCap = sc.nextInt();
        memo = new int[n+1][maxCap+1];
        for (int i = 0; i < n+1; i++) {
            Arrays.fill(memo[i], -1);
        }
        int ans = memoization(weight,value,maxCap,0);
        int ans2 = topDown(weight,value,maxCap);
        System.out.println(ans2);
    }
    static int recursive(int[] weight,int[] profit,int maxCap,int i){
        if(i == weight.length || maxCap <= 0){
            return 0;
        }

        int include = 0;
        if(weight[i] <= maxCap)
            include = profit[i] + recursive(weight,profit,maxCap-weight[i],i+1);
        int exclude = recursive(weight,profit,maxCap,i+1);

        return Math.max(include,exclude);
    }
    static int memoization(int[] weight,int[] profit,int maxCap,int i){
        if(i == weight.length) {
            return 0;
        }
        if(memo[i][maxCap] != -1) {
            return memo[i][maxCap];
        }

        int include = 0;
        if(weight[i] <= maxCap){
            include = profit[i] +  memoization(weight,profit,maxCap-weight[i],i+1);
        }
        int exclude = memoization(weight,profit,maxCap,i+1);

        return memo[i][maxCap] = Math.max(include,exclude);
    }
    static int topDown(int[] wt,int[] val,int W){
        int[][] dp = new int[wt.length+1][W+1];
        fillDp(dp);

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(wt[i-1] <= j){
                    dp[i][j] = Math.max((val[i-1]+dp[i-1][j-wt[i-1]]) , dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[wt.length][W];
    }
    static void fillDp(int[][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 || j==0) dp[i][j] = 0;
            }
        }
    }
}
