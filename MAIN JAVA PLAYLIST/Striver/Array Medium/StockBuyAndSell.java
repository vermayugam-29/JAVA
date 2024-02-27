import java.util.*;

public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int k = 0; k < a.length; k++) {
            a[k] = sc.nextInt();
        }
        int ans = profit(a);
        System.out.println(ans);
    }
    public static  int profit(int[] arr){
        //we have to return max profit
        int min = Integer.MAX_VALUE;
        int diff = 0;
        int maxP = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(min>arr[i]){
                min=arr[i];
            } 
            diff = arr[i+1]-min;
            maxP = Math.max(diff,maxP);
        }
        return maxP;
    }
}
