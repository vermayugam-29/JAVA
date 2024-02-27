import java.util.Arrays;

public class HouseRobber1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        System.out.println(solve(nums,0,dp));
    }
    static int solve(int[] arr,int idx,int[] dp){
        if(idx >= arr.length){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        int include = arr[idx]+solve(arr,idx+2,dp);
        int exclude = solve(arr,idx+1,dp);

        return dp[idx] =Math.max(include,exclude);
    }
}
