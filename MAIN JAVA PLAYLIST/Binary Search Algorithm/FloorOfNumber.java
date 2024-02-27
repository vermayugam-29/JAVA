import java.util.Scanner;

public class FloorOfNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(FloorNumber(arr, target));

     }
     static int  FloorNumber(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        if(target<arr[0]) return -1;
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
