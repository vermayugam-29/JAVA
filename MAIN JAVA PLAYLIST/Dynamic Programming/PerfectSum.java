import java.util.*;

public class PerfectSum {
    static int mod = 1000000007;
    static int[][] memo;
    public static void main(String[] args) {
        int[] arr = {1,0};
        int sum = 1;
        int n = arr.length;
        memo = new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(memo[i],-1);
        }
//        int ans = solve(arr,sum,0);
//        System.out.println(ans);
        System.out.println(tabulation(arr,sum));
    }
    private static int solve(int[] arr,int sum,int i){
        if(i == arr.length){
            if(sum == 0) return 1;
            return 0;
        }
        if(sum < 0) return 0;
        if(memo[i][sum] != -1) return memo[i][sum]%mod;

        int cnt = 0;
        cnt = (cnt + solve(arr,sum-arr[i],i+1)) % mod;
        cnt = (cnt + solve(arr,sum,i+1)) % mod;

        return memo[i][sum]  = cnt % mod;
    }
    private static int tabulation(int[] arr,int sum){
        int[][] dp = new int[arr.length+1][sum+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }
        dp[0][0] = 1;

        for(int i=1;i<dp.length;i++){
            for (int j = 0; j < dp[0].length; j++) {
                if(arr[i-1] <= j){
                    dp[i][j] = (dp[i-1][j] + dp[i-1][j-arr[i-1]]) % mod;
                } else {
                    dp[i][j] = (dp[i-1][j]) % mod;
                }
            }
        }
        return dp[arr.length][sum] % mod;
    }
}
