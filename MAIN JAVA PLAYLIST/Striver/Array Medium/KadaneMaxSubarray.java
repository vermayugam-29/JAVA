import java.util.*;

public class KadaneMaxSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = sc.nextInt();
        }
        // System.out.println(SubarrraySum(arr, n));
        System.out.println(Kadane(arr));
    }
    //my method------------------------------------------------------------------------------------------
    public static int SubarrraySum(int[] arr,int n){
        int store=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
            }
            if(sum>store) store = Math.max(sum,store);
        }
        return store;
    }
    //kadane algo---------------------------------------------------------------------------------------------
    public static int Kadane(int[] arr){
        int sum = 0;
        int max = arr[0];//max sum
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            max = Math.max(sum,max);
            if(sum<0) sum =0;
        }
        return max;
    }
}
