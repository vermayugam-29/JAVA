import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]){
                arr[count] = arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
}