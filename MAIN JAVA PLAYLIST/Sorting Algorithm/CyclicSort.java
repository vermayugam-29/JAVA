import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Cycle2(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void Cycle(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int correct = arr[i] -1;
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
                i--;
            }
            else{
                continue;
            }
        }
    }
    static void Cycle2(int[] arr){
        int i = 0;
        while (i<arr.length) {
            int correct = arr[i] -1;
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
    }
}
