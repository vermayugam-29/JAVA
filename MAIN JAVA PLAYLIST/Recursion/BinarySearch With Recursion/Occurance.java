import java.util.Arrays;
import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] ans = new int[2];
        int idx = -1;
        ans[0] = first(arr,target,0,n-1,idx);
        ans[1] = last(arr,target,0,n-1,idx);

        System.out.println(Arrays.toString(ans));
    }
    static int first(int[] arr,int target,int start,int end,int idx){
        if(start > end){
            return idx;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            idx = mid;
            return first(arr,target,start,mid-1,idx);
        }
        else if(arr[mid] > target){
            return first(arr,target,start,mid-1,idx);
        }
        return first(arr,target,mid+1,end,idx);
    }
    static int last(int[] arr,int target,int start,int end,int idx){
        if(start > end){
            return idx;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            idx = mid;
            return last(arr,target,mid+1,end,idx);
        }
        else if(arr[mid] > target){
            return last(arr,target,start,mid-1,idx);
        }
        return last(arr,target,mid+1,end,idx);
    }
}
