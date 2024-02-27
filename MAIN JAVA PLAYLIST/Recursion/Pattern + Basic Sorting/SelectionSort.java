import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,4,4,2,3,0,-4,56};

        System.out.println(Arrays.toString(sort(arr,0)));
    }
    static int[] sort(int[] arr, int i) {
        // base case
        if (i >= arr.length-1) {
            return arr;
        }

        int lastIdx = arr.length - 1 - i;
        int maxIdx = maxEle(arr, 0, 0,lastIdx);

        swap(arr, maxIdx, lastIdx);
        return sort(arr, i + 1);
    }

    // finding maximum element index
    static int maxEle(int[] arr, int maxIdx, int idx,int lastIdx) {
        if (idx > lastIdx) {
            return maxIdx;
        }

        if (arr[idx] >= arr[maxIdx]) {
            maxIdx = idx;
        }
        return maxEle(arr, maxIdx, idx + 1,lastIdx);
    }


    //swapping function
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
