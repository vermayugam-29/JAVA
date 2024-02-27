import java.util.Arrays;
import java.util.Scanner;

public class UnboundedKnapsack {
    static int[][] memo;
    static int solve(int[] wt,int[] profit,int maxCap,int i){
        if(i == wt.length) return 0;
        if(memo[i][maxCap] != -1) return memo[i][maxCap];

        int include = 0;
        if(maxCap >= wt[i]) include = profit[i] + solve(wt,profit,maxCap-wt[i],i);
        int exclude =  solve(wt,profit,maxCap,i+1);

        return memo[i][maxCap] = Math.max(include,exclude);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        int W = sc.nextInt();
        memo = new int[n+1][W+1];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        int ans = solve(wt,val,W,0);
        System.out.println(ans);
    }
}
