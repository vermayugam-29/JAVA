import java.util.Arrays;

public class IntegerBreak {
    static int[] memo;
    public static void main(String[] args) {
        int n = 5;
        memo = new int[n+1];
        Arrays.fill(memo,-1);
        System.out.println(solve(n));
    }
    private static int solve(int n){
        if(n == 1) return 1;
        if(memo[n] != -1) return memo[n];

        int max = 0;
        for(int i=1;i<=n;i++){
            int pro1 = i*solve(n-i);
            int pro2 = i*(n-i);
            max = Math.max(max,Math.max(pro1,pro2));
        }
        return memo[n] = max;
    }
}