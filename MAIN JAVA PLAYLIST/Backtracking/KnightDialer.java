import java.util.Scanner;

public class KnightDialer {
    static int[][] adj = { { 4, 6 }, { 6, 8 }, { 7, 9 }, { 4, 8 }, { 0, 3, 9 }, {}, { 0, 1, 7 }, { 2, 6 }, { 1, 3 },
            { 2, 4 } };
    static int mod = 1000000000 + 7;
    static Integer[][] memo = new Integer[5001][10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = knightDialer(n);
        System.out.println(ans);
    }

    private static  int knightDialer(int n) {
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            cnt = (cnt + dfs(n - 1, i)) % mod;
        }
        return cnt;
    }

    private  static int dfs(int n, int currPos) {
        if (n == 0)
            return 1;
        if (memo[n][currPos] != null)
            return memo[n][currPos];

        int cnt = 0;
        for (int nextPos : adj[currPos]) {
            cnt = (cnt + dfs(n - 1, nextPos)) % mod;
        }

        return memo[n][currPos] = cnt % mod;
    }
}
