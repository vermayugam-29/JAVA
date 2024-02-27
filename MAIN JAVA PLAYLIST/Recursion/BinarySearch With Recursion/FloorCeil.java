import java.util.Arrays;
import java.util.Scanner;

public class FloorCeil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] ans = new int[2];
        ans[0] = floor(arr,target,0,n-1);
        ans[1] = ceil(arr,target,0,n-1);

        System.out.println(Arrays.toString(ans));
    }
    static int floor(int[] arr,int target,int start,int end){
        if(start > end){
            return arr[end];
        }
        if(arr[0] > target){
            return -1;
        }
        int mid = start + (end-start)/2;



        if(arr[mid] > target){
            return floor(arr,target,start,mid-1);
        }
        return floor(arr,target,mid+1,end);
    }
    static int ceil(int[] arr,int target,int start,int end){
        if(start > end){
            return arr[start];
        }

        if(arr[arr.length-1] < target){
            return -1;
        }

        int mid = start + (end-start)/2;


        if(arr[mid] >= target){
            return ceil(arr,target,start,mid-1);
        }
        return ceil(arr,target,mid+1,end);
    }

}
