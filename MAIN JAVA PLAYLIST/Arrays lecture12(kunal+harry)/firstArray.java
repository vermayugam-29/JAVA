import java.util.*;

public class firstArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int[] rollNo = new int[5];
        // System.out.println(rollNo[3]);

        // String[] str1 = new String[5];
        // System.out.println(str1[0]);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // for (int num : arr){  // enhanced for loop print for array or for-each loop
        //     System.out.print(num + " "); // num represent element of array
        // }
        System.out.println(Arrays.toString(arr));
    }
}