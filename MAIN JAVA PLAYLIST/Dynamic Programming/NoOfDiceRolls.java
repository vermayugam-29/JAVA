import java.util.*;

public class NoOfDiceRolls {
    static int mod = 1000000007;
    static int[][] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//no of dice
        int k = sc.nextInt();//no of faces
        int target = sc.nextInt();//target
        memo = new int[n + 1][target + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(memo[i], -1);
        }
        System.out.println(solve(n,k,target));
    }
    private static int solve(int dices, int face, int target) {
        if(dices == 0) {
            if(target == 0) return 1;
            return 0;
        }
        if (memo[dices][target] != -1) return memo[dices][target] % mod;

        int ways = 0;
        for (int i = 1;(target >= i) && i <= face; i++) {
            ways = (ways + solve(dices - 1, face, target - i)) % mod;
        }
        return memo[dices][target] = ways % mod;
    }
}
