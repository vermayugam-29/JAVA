import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            
            int a = Firstoccur(arr,x);
            int b = FindLast(arr,x);

            int ans = b-a+1;

            if(a==-1 && b==-1) ans =0;
            System.out.println(ans);
    }
    public static int Firstoccur(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target) {
                index =mid;
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid +1;
            }
            else if(arr[mid]>target){
                end = mid-1;
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
