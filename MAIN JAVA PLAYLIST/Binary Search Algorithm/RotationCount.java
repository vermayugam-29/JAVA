import java.util.*;

public class RotationCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int pivot = findPivot(arr);
        int result = pivot+1;
        System.out.println(result);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(end>mid && arr[mid]>arr[mid+1]) return mid;
            else if(mid>start && arr[mid-1]>arr[mid]) return mid-1;
            else if(arr[start] >= arr[mid]) end = mid-1;
            else start = mid+1;
        }
        return -1;
    }
}
