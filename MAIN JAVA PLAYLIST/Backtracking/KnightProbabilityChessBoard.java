public class KnightProbabilityChessBoard {
    static int[] dx = { -2, -2, -1, -1, 2, 2, 1, 1 };
    static int[] dy = { 1, -1, -2, 2, -1, 1, 2, -2 };
    static Double[][][] memo;
    public static void main(String[] args) {
        int n = 3, k= 2, row = 0, column = 0;
        double ans = knightProbability(n,k,row,column);
        System.out.println(ans);
    }

    public static double knightProbability(int n, int k, int row, int column) {
        memo = new Double[n + 1][n + 1][k + 1];
        return validMoves(row, column, k, n);
    }

    private static double validMoves(int r, int c, int k, int n) {
        if (r < 0 || c < 0 || r >= n || c >= n)
            return 0;

        if (k == 0)
            return 1;

        if (memo[r][c][k] != null)
            return memo[r][c][k];

        double ways = 0;
        for (int i = 0; i < dx.length; i++) {
            ways += validMoves(r + dx[i], c + dy[i], k - 1, n);
        }

        return memo[r][c][k] = (ways / 8.0);
    }
}
