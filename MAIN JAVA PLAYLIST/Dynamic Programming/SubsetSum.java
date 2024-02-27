import java.util.Arrays;

public class SubsetSum {
    static int[][] memo;
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        memo = new int[arr.length+1][sum+1];
        for(int i=0;i<arr.length+1;i++){
            Arrays.fill(memo[i],-1);
        }
        boolean ans1 = memoization(arr, 0, sum) == 1;
        System.out.println(ans1);
        boolean ans2 = topDown(arr,sum);
        System.out.println(ans2);
    }
    static int memoization(int[] arr,int i,int sum){
        if(sum == 0) return 1;
        if(i == arr.length || sum < 0) return 0;

        if(memo[i][sum] != -1) return memo[i][sum];

        return memo[i][sum] = memoization(arr,i+1,sum-arr[i]) == 1 ||
                                memoization(arr,i+1,sum) == 1 ? 1 : 0;
    }
    static boolean topDown(int[] arr,int sum){
        boolean[][] dp = new boolean[arr.length+1][sum+1];
        fillDP(dp);

        for(int i=1;i<dp.length;i++){
            for (int j = 1; j < dp[0].length; j++) {
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[arr.length][sum];
    }
    static void fillDP(boolean[][] dp){
        for(int i=0;i<dp.length;i++){
            for (int j = 0; j < dp[0].length; j++) {
                if(j == 0){
                    dp[i][j] = true;
                } if(i == 0 && j != 0){
                    dp[i][j] = false;
                }
            }
        }
    }
}
