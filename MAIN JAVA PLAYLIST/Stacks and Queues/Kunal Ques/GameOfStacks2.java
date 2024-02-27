import java.util.Arrays;
import java.util.Scanner;

public class GameOfStacks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(solve(a,b,0,0,max)-1);
    }
    static int solve(int[] a,int[] b,int sum,int cnt,int max){
        //base case
        if(sum > max) return cnt;
        //edge case
        if(a.length == 0 || b.length == 0) return cnt;

        int sum1 = solve(Arrays.copyOfRange(a,1,a.length),b,sum+a[0],cnt+1,max);
        int sum2 = solve(a,Arrays.copyOfRange(b,1,b.length),sum+b[0],cnt+1,max);

        return Math.max(sum1,sum2);
    }
}
