import java.util.*;
public class LeetCode852 {
    public static void main(String[] args) { //Find peak element in mountain array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = Binary(arr);
        System.out.println(ans);
    }
    public static int Binary(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return start;//can return either start or mid
    }
}
