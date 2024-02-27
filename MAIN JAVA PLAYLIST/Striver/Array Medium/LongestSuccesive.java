import java.util.Arrays;
import java.util.Scanner;

public class LongestSuccesive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int k = 0; k < a.length; k++) {
            a[k] = sc.nextInt();
        }
        Arrays.sort(a);
        int count=1;
        int max=0;
        for (int i = 1; i < a.length; i++) {
            if(a[i] - a[i-1]==1) count++;
            else if(a[i]==a[i-1]) continue;
            else count=1;

            max=Math.max(max,count);
        }
        System.out.println(max);
        
    }
}
