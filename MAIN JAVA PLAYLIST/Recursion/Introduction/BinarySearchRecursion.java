import java.util.Scanner;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        
        System.out.println(BinaryRecursion(arr, target, 0, n));
    }
    static int BinaryRecursion(int[] arr,int target,int start,int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return  BinaryRecursion(arr, target, mid+1, end);
        }

        return BinaryRecursion(arr, target, start, mid - 1);
    }
}
