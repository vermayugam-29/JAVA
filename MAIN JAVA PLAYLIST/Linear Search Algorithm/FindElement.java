import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}