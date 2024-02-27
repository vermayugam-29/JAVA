import java.util.Arrays;

public class EqualSumPartition {
    static int[][] memo;
    static int total;
    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        total = 0;
        for(int i : nums){
            total += i;
        }
        memo = new int[nums.length+1][total+1];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
//        boolean ans = solve(nums,0,0) == 1;
//        System.out.println(ans);
        boolean tab = tabulation(nums,total/2);
        System.out.println(tab);
    }
    private static int solve(int[] arr,int i,int sum){
        if((total - sum) == sum) return 1;
        if(i == arr.length) return 0;
        if(memo[i][sum] != -1) return memo[i][sum];

        return memo[i][sum] = solve(arr,i+1,sum+arr[i])==1 || solve(arr,i+1,sum)==1 ? 1 : 0 ;
    }
    private static boolean tabulation(int[] arr,int sum){
        boolean[][] dp = new boolean[arr.length+1][sum+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0] = true;
        }

        for(int i=arr.length-1;i >=0;i--){
            for (int j=0;j<=sum;j++){
                boolean inc = false;
                if(j - arr[i] >= 0){
                    inc = dp[i+1][j-arr[i]];
                }
                boolean exc = dp[i+1][j];
                dp[i][j] = inc || exc;
            }
        }
        return dp[0][sum];
    }
}
