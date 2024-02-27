import java.util.Scanner;

public class MaximumSubarraySizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(window(arr,k));
    }
    private static int window(int[] arr,int k){
        if(k > arr.length) return -1;

        int i = 0; //start of window
        int j = 0; //end of window

        int sum = 0;
        int max = Integer.MIN_VALUE;

        while(j < arr.length){
            sum += arr[j];
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                max = Math.max(max,sum);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }

        return max;
    }
}
