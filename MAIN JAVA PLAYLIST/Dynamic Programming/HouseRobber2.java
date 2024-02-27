import java.util.Arrays;

public class HouseRobber2 {
    static int[][] memo;
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,3};
        if(arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }
        memo = new int[arr.length+1][arr.length+1];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        int ans = Math.max(solve(arr,0,arr.length-2),solve(arr,1,arr.length-1));
    }
    private static int solve(int[] arr,int idx,int end){
        if(idx > end) return 0;
        if(memo[idx][end] != -1) return memo[idx][end];

        int rob = arr[idx] + solve(arr,idx+2,end);
        int not = solve(arr,idx+1,end);

        return memo[idx][end] = Math.max(rob,not);
    }
}
