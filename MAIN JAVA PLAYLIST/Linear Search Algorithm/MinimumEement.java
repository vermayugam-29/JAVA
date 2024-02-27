import java.util.Scanner;

public class MinimumEement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            if(i<min){
                min = i;
            }
        }
        System.out.println(min);
    }
}
