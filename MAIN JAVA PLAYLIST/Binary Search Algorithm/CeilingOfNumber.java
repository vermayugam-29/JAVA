import java.util.Scanner;
public class CeilingOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(CeilingNumber(arr, target));

    }
    static int  CeilingNumber(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        if(target>arr[arr.length-1]) return -1;
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
        return arr[start];
    }
}
