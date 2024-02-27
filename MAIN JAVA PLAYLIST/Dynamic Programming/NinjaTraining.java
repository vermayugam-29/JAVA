import java.util.Arrays;
import java.util.Scanner;

public class NinjaTraining {
    static int[][] memo;
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,5},
                {3,1,1},
                {3,3,3}
        };
        int n = arr.length;
        memo = new int[n][4];
        for(int[] row : memo){
            Arrays.fill(row,-1);
        }
        int ans =  solve(arr,0,-1);
        System.out.println(ans);
    }
    private static int solve(int[][] arr,int r,int prev){
        if(r >= arr.length) return 0;
        if(memo[r][prev+1] != -1) return memo[r][prev+1];

        int max = 0;
        for(int i=0;i<3;i++){
            if(i != prev){
                int ans = arr[r][i] + solve(arr,r+1,i);
                max = Math.max(ans,max);
            }
        }

        return memo[r][prev+1] = max;
    }
}
