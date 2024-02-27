import java.util.Map;
import java.util.Scanner;

public class LargestSubarraySumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int maxLen = findLongest(arr,k);
        System.out.println(maxLen);
    }
    private static int findLongest(int[] arr,int k){
        int i = 0;
        int j = 0;

        long sum = 0;
        int max = 0;
        while(j < arr.length){
            sum += arr[j];

            if(sum < k){
                j++;
            } else if(sum == k){
                max = Math.max(max,(j-i+1));
                j++;
            } else {
                while (sum > k){
                    sum -= arr[i];
                    i++;
                }
                if(sum == k) max = Math.max(max,j-i+1);
                j++;
            }
        }
        return max;
    }
}
