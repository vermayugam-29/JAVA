import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr));
    }
    static int solve(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        return count;
    }
    static void swap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
