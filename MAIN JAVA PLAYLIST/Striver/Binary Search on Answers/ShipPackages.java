import java.util.Scanner;

public class ShipPackages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int days = sc.nextInt();

        int ans = BinarySearch(nums,days);
        System.out.println(ans);
    }
    public static int BinarySearch(int[] arr,int target){
        int start = Integer.MIN_VALUE;
        int end = 0;
        //changing values of start and end
        for(int i=0;i<arr.length;i++){
            start = Math.max(arr[i],start);
            end += arr[i];
        }
        //using binary search
        while(start <= end){
            int mid = start + (end-start)/2;
            int days = findDays(arr,mid);//
            if(days <= target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }
    //no of days taken using mid as a weight per day
    public static int findDays(int[] arr,int mid){
        int days = 1;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if(ans + arr[i] <= mid){
                ans += arr[i];
            }
            else{
                days++;
                ans = arr[i];
            }
        }
        return days;   
    }
}
