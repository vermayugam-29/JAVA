import java.util.Scanner;

public class MinInRotatedArray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = findMin(arr);
            System.out.println(ans);
    }
    public static int findMin(int[] nums) {
        int min = findMinimum(nums);
        return min;
    }
    public static int findMinimum(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }
            if(start<mid && arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return arr[0];
    }
}
