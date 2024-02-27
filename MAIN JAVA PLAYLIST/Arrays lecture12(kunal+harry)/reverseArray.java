import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter values of array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
       /* array reverse using for loop---------------------------------------
       for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        */ 
        // array reverse using swap method
        int l = arr.length;
        int temp;
        int  k = Math.floorDiv(l, 2); // used for L/2
        for (int i = 0; i < k; i++) {
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element : arr){
            System.out.print(element + " ");
        }


    }
}
