import java.util.Scanner;

public class SearchRotatedII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            
            boolean ans = search(arr,target);

            System.out.println(ans);
        
    }
    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1){
            return Binary(nums,0,nums.length-1,target);
        }
        else if(nums[pivot] == target){
            return true;
        }
        else if(nums[0] <= target){
            return Binary(nums,0,pivot-1,target);
        }
        return Binary(nums,pivot+1,nums.length-1,target);
    }
    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if(start < mid && arr[mid-1] > arr[mid]) {
                return mid-1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(start < end && arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(end > start && arr[end] < arr[end-1]) {
                    return end-1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static boolean Binary(int[] arr,int start,int end,int target){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
