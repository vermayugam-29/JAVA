import java.util.*;
public class AddNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int a = 0;
        int k = n-1;
        while(a<k){
            int temp = arr[a];
            arr[a] = arr[k];
            arr[k] = temp;
            a++;
            k--;
        }
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}