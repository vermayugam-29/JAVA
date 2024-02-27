import java.util.Arrays;
import java.util.Scanner;

public class Ques43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solve2(arr, n);
    }
    static void solve2(int[] arr,int n){
        int[] ans = new int[n];

        for(int i=0;i<arr.length;i++){
            int maxIdx = findMax(arr);
            ans[i] = maxIdx;
            arr[maxIdx] = Integer.MIN_VALUE; //changing value of curr max because we don't need
            // this anymore and this will also help in excluding duplicates
        }
        System.out.println(Arrays.toString(ans));
    }
    static int findMax(int[] arr){
        int idx = 0;
        for (int i=0;i<arr.length;i++){
            if(arr[idx] < arr[i]){
                idx = i;
            }
        }
        return idx;
    }
}

/*
static void solve(int[] arr, int n) {
        // Create an array of indices and initialize it with the indices from 0 to n-1
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort the indices array based on the corresponding values in the input array
        //using comparator
        Arrays.sort(indices, (a, b) -> Integer.compare(arr[b], arr[a]));

        // Print the sorted indices
        for (int i : indices) {
            System.out.print(i + " ");
        }
    }
 */
