import java.util.Arrays;
import java.util.Scanner;

public class Ques39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        //sorting the array
        Arrays.sort(arr);
        int ans = arr[n-k];

        System.out.println(ans);
    }
}
