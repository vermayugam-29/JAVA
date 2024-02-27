import java.util.Scanner;

public class CherryPickUpII {
    static Integer[][][] memo;;
    public static void main(String[] args) {
        int[][] grid = {
                {3,1,1},
                {2,5,1},
                {1,5,5},
                {2,1,1}
        };
        memo = new Integer[grid.length + 1][grid[0].length + 1][grid[0].length + 1];
        System.out.println(dfs(grid, 0, 0, grid[0].length - 1));
    }
    private static int dfs(int[][] grid, int r, int c1, int c2) {
        if (r >= grid.length || c1 < 0 || c2 < 0 || c1 >= grid[0].length || c2 >= grid[0].length)
            return 0;
        if (memo[r][c1][c2] != null)
            return memo[r][c1][c2];

        int max = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int ans = 0;
                if (c1 == c2)
                    ans += grid[r][c1] + dfs(grid, r + 1, c1 + i, c2 + j);
                else
                    ans += grid[r][c1] + grid[r][c2] + dfs(grid, r + 1, c1 + i, c2 + j);
                max = Math.max(ans, max);
            }
        }
        return memo[r][c1][c2] = max;
    }
}
