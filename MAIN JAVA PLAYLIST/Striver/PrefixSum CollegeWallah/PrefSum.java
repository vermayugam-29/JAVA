import java.util.Arrays;
import java.util.Scanner;

public class PrefSum { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new  int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // int l = sc.nextInt();
        // int r = sc.nextInt();

        // PrefixSum(arr);
        // System.out.println(Ques2(arr, l, r));
        SuffixSum(arr);
    }
    public static void PrefixSum(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i]; // arr[i] += arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void SuffixSum(int[] arr){
        for (int i = arr.length-2; i >= 0; i--) {
            arr[i] = arr[i+1] + arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int Ques2(int[] arr,int l,int r){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i]; // arr[i] += arr[i-1];
        }
        int sum = arr[r-1] - arr[l-2]; //because l and r are based on 1-based indexing
        return sum;
    }
}