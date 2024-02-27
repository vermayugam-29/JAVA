import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }   
            int ans = findPeakElement(arr);
            System.out.println(ans);
    }
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int peak = findPeak(nums,n);
        return peak;
    }
    public static int findPeak(int[] arr,int n){
        if(n == 1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;

        int start = 1;
        int end = n - 2;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;
            if(arr[mid] > arr[mid-1]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
