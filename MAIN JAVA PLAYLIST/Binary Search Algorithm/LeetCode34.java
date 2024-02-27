import java.util.Arrays;
import java.util.Scanner;

public class LeetCode34 {
    public static void main(String[] args) { //Find first and last occorance of target in array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] ans = new int[2];
        ans[0] = Findfirst(arr, target);
        ans[1] = FindLast(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int  Findfirst(int[] nums,int target){
        int index=  -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(target == nums[mid]){
                index = mid;
                end = mid - 1;
            }
            else if(target < nums[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return index;
    }
    public static int FindLast(int[] nums,int target){
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target == nums[mid]){
                index = mid;
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end  = mid -1;
            }
            else {
                start = mid +1;
            }
        }
        return index;
    }
}
