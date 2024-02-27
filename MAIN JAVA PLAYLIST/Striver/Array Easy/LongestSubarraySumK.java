import java.util.*;

public class LongestSubarraySumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sum = 0;
        int count = 0;
        int store = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            count = 0;
            for (int j = i; j < arr.length; j++) {
                sum +=arr[j];
                count++;
                if(sum == k){
                    store = Math.max(store,count);
                }
            }
        }
        System.out.println(store);
    }
}
