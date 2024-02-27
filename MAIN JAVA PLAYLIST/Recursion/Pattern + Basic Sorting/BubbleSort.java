import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(sort(arr,0,0)));
    }
    static int[] sort(int[] arr,int i,int j){
        //base case
        if(i >= arr.length) return arr;

        if(j == arr.length-1) return sort(arr,i+1,0);

        if(arr[j] > arr[j+1]){
            swap(arr,j,j+1);
            return sort(arr,i,j+1);
        }
        return sort(arr,i,j+1);
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
