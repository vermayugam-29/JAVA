import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        int sum2 = 0;
        for(int i = 1;i<=arr.length;i++){
            sum2 += i;
        }
        System.out.println(sum - sum2);
    }
}
