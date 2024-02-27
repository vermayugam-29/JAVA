import java.util.Arrays;
import java.util.Scanner;

public class BouquetsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] bloomDay = new int[n]; //array of days in which bloomDay[i] gives time taken by ith flower to bloom 
        for (int i = 0; i < bloomDay.length; i++) {
            bloomDay[i] = sc.nextInt();
        }

        int m = sc.nextInt(); //no of bouquets to make
        int k = sc.nextInt(); //no of flowers per bouquet
        
        int[] arr = new int[2];
        MinMax(arr, bloomDay);
        int max = arr[0];
        int min = arr[1];

        int ans = BinarySearch(bloomDay, max, min, m, k);
        System.out.println(ans);
    }
    //searching for best possible answer
    public static int BinarySearch(int[] bloomDay,int max,int min,int m,int k){
        int start = min;
        int end = max;

        long val=(long)m*k;
        if( val > bloomDay.length) return -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(isPossible(bloomDay, mid, m, k)){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    //checking if the mid is possible answer or not
    public static boolean isPossible(int[] bloomDay,int mid,int m,int k){
        int n = 0;//no of bouqets possible
        int count = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <= mid){
                count++;
            }
            else{
                n += (count/k);
                count = 0;
            }
        }
        n += (count/k);
        if(n >= m) return true;
        return false;
    }
    //func to find min and max value of bloomDay array
    public static void MinMax(int[] arr,int[] bloomDay){
        arr[0] = bloomDay[0];
        arr[1] = bloomDay[0];

        for (int i = 0; i < bloomDay.length; i++) {
            arr[0] = Math.max(arr[0], bloomDay[i]);
            arr[1] = Math.min(arr[1], bloomDay[i]);
        }
    }
}
