import java.util.*;
public class RotateArray {

    public static void Rev(int[] arr,int k,int n){
        
        while(k<n){
            int temp = arr[k];
            arr[k] = arr[n];
            arr[n]= temp;
            k++;
            n--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        int k = sc.nextInt();
        k %= arr.length;
        Rev(arr, 0, n-1);    // from index 0-5 {if n=2}
        Rev(arr, 0, k - 1);  //from index 0-2 (if k=3)
        Rev(arr, k, n-1);      //from index 3-5

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
