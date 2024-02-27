import java.util.Arrays;
import java.util.Scanner;

public class LeetCode41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Cycle(arr);
        int ans = 0;
        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                ans = i+1;
                break;
            }
            else{
                ans = arr.length + 1;
            }
        }
        System.out.println(ans);
        
    }
    static void Cycle(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i]<0 || arr[i]>arr.length-1) i++;
            else if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }
     static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
