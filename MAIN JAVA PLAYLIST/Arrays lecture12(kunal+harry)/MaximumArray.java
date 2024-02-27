import java.util.*;

public class MaximumArray {
    public static void main(String[] args) {
        // int[] arr = {2,56,78,45,89};
        // System.out.println(Math.max(arr[4],Math.max(arr[3],Math.max(arr[2],Math.max(arr[0],arr[1])))));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(max(arr));
        // max();
    }
    static int max(int[] arr){
        int MaxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[0]){
                // System.out.println(arr[i]);
                MaxVal = arr[i];
            }
        }
        return MaxVal; 
    }
}
