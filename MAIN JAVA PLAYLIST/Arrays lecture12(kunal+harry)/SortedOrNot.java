import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true ; 
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}
