import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = sc.nextInt();
        }
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void nextPermutation(int[] nums) {
        //first of all find the breakpoint
        int breakPoint = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                breakPoint = i;
                break;
            }
        }
        if(breakPoint == -1){
            reverse(nums,0,nums.length-1);
            return;
        }

        for(int i=nums.length-1;i>=breakPoint;i--){
            if(nums[i] > nums[breakPoint]){
                swap(nums,breakPoint,i);
                break;
            }
        }
        reverse(nums,breakPoint+1,nums.length-1);
    }
    private static void swap(int[] arr,int s,int e){
        int temp= arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    private static void reverse(int[] arr,int i,int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
