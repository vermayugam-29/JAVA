import java.util.Arrays;
import java.util.Scanner;

public class LeetCode645 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[2];
        SetMismatch(arr, ans);
        System.out.println(Arrays.toString(ans));
    }
    static  void SetMismatch(int[] arr,int[] ans){
        Cycle(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                ans[0] = arr[i];
                ans[1] = i+1;
            }
        }
    }
    static void Cycle(int[] arr){
        int i= 0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
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
