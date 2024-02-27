import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i];
            if (arr[i]>n-1) {
                continue;
            }
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
                i--;
            }
            else{
                continue;
            }
        }
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
