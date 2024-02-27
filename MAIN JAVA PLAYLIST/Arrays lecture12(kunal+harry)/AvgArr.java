import java.util.Scanner;

public class AvgArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the size of array:");
        int n = sc.nextInt();
        //declaring array
        int[] arr = new int[n];
        System.out.print("Enter elements of array: ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.print("Average :" + sum/arr.length);
    }
}
