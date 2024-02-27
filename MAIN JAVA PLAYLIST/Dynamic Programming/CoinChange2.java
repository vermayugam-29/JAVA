import java.util.Arrays;

public class CoinChange2 {
    static int[][] memo;
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 5;
        memo = new int[coins.length+1][amount+1];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        System.out.println(solve(coins,0,amount));
    }
    static int solve(int[] arr,int i,int amount){
        if(i == arr.length){
            if(amount == 0) return 1;
            return 0;
        }
        if(memo[i][amount] != -1) return memo[i][amount];

        int include = 0;
        if(amount >= arr[i]){
            include = solve(arr,i,amount-arr[i]);
        }
        int exclude = solve(arr,i+1,amount);

        return memo[i][amount] = include + exclude;
    }
}
