import java.util.Arrays;
import java.util.Scanner;

public class FloorAndceil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int[] ans = new int[2];

        ans[0] = FloorNumber(arr,target);
        ans[1] = CeilingNumber(arr,target);

        System.out.println(Arrays.toString(ans));
    }
    static int  CeilingNumber(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        if(target>arr[arr.length-1]) return -1;
        else{
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[start];
        }
    }
    static int  FloorNumber(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        if(target<arr[0]) return -1;
        else{
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[end];
        }
    }
}
