import java.util.Scanner;

public class MinimumFallingSum2 {
    static int n;
    static Integer[][] memo;

    public static  int minFallingPathSum(int[][] grid) {
        n = grid.length;
        memo = new Integer[n + 1][n + 1];
        int min = Integer.MAX_VALUE;
        for (int col = 0; col < n; col++) {
            min = Math.min(min, dfs(grid, 0, col));
        }
        return min;
    }

    private static int dfs(int[][] grid, int r, int c) {
        if (c >= n || c < 0)
            return 100000;
        if (r == n - 1)
            return grid[r][c];
        if (memo[r][c] != null)
            return memo[r][c];
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (i != c) {
                ans = Math.min(ans, grid[r][c] + dfs(grid, r + 1, i));
            }
        }

        return memo[r][c] = ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] grid = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int ans = minFallingPathSum(grid);
        System.out.println(ans);
    }
}
