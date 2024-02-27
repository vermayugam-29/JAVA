import java.util.Arrays;
import java.util.Scanner;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void divide(int[] arr,int start,int end){
        //base case :-
        //if array has only one element left
        if(start >= end){
            return;
        }
        //finding mid
        int mid = (start + end ) / 2;

        //for solving left half
        divide(arr,start,mid);
        //for solving right half
        divide(arr,mid+1,end);

        //merging both arrays
        merge(arr,start,mid,end);
    }
    static void merge(int[] arr,int start,int mid,int end){
        //making a new array to store values of array
        int[] ans = new int[end-start+1];

        int i = start;//pointer for left half of array
        int j = mid + 1;//pointer for right half of array

        int k = 0;//pointer for answer array

        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                ans[k++] = arr[i++];
            }
            else{
                ans[k++] = arr[j++];
            }
        }
        //for remaining elements
        while(i <= mid){
            ans[k++] = arr[i++];
        }
        while(j <= end){
            ans[k++] = arr[j++];
        }
        //updating our initial array
        for(int x = start ; x <= end ; x++ ){
            arr[x] = ans[x - start];
        }
    }
}
