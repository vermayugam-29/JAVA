import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int threshold = sc.nextInt();

        int ans = BinarySearch(nums,threshold);
        System.out.println(ans);
    }
    public static int BinarySearch(int[] arr,int target){
        int start = 1;
        int end = findMax(arr);
        while(start <= end){
            int mid = start + (end-start)/2;
            int a = divisor(arr,mid);
            if(a > target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
    public static int divisor(int[] arr,int mid){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans += Math.ceil((double)arr[i]/(double)mid);
        }
        return ans;
    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}
