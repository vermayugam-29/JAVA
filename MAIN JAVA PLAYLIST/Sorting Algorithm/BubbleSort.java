import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }
    static void swap(int[] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}