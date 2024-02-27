import java.util.*;

public class LongestSubarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new  int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count = 0;
        int len = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                count++;
                if(sum == k){
                    len = Math.max(len,count);
                }
            }
        }
        System.out.println(len);
    }
}