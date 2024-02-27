import java.util.Arrays;
import java.util.Scanner;

public class Ques41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minIdx = findMin(arr, i);
            swap(arr,i,minIdx);
            System.out.println(Arrays.toString(arr));
        }
    }
    static int findMin(int[] arr,int start){
        int minIdx = start;
        for (int i = start; i <arr.length; i++) {
            if(arr[minIdx] > arr[i]){
                minIdx = i;
            }
        }
        return minIdx;
    }
    static void  swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
