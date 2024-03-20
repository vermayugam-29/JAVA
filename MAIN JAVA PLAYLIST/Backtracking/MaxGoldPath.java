public class MaxGoldPath {
    static int[] dx = { 1, 0, -1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static int m, n;

    public static int getMaximumGold(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    private static int dfs(int[][] grid, int r, int c) {
        if (r >= m || c >= n || r < 0 || c < 0 || grid[r][c] == 0)
            return 0;

        int temp = grid[r][c];
        grid[r][c] = 0;

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum = Math.max(temp + dfs(grid,r + dx[i],c + dy[i]),sum);
        }
        grid[r][c] = temp;

        return sum;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0,6,0},
                {5,8,7},
                {0,9,0}
        };
        int ans = getMaximumGold(grid);
        System.out.println(ans);
    }
}
