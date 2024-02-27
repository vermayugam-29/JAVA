import java.util.Scanner;

public class CoinChange1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int amount = sc.nextInt();

        solve(arr,amount,0,0);
        int ans = min == Integer.MAX_VALUE ? -1 : min;

        System.out.println(ans);
    }
    static int min = Integer.MAX_VALUE;
    static void solve(int[] arr,int amount,int idx,int coins){
        if(idx == arr.length){
            if(amount == 0) min = Math.min(coins,min);
            return;
        }
        if(amount >= arr[idx]){
            solve(arr,amount-arr[idx],idx,coins+1);
        }
        solve(arr,amount,idx+1,coins);

        //backtracking
        if(coins > 0) coins = coins - 1;
    }
}
