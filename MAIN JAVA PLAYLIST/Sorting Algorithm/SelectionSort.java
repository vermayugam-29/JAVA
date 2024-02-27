import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length-i-1; //for last index and -i used  to decrease length of iteration 
            int MaxEleIndex = MaxIndex(arr,0,lastIndex);//for index of maximum element
            swap(arr,MaxEleIndex,lastIndex);
        }
    }


    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    
    static int MaxIndex(int[] arr,int start,int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}