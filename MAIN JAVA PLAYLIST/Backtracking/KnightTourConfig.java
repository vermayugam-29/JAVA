import java.util.Scanner;

public class KnightTourConfig {
    static int[] dx = { -2, -2, -1, 1, 2, 2, 1, -1 };
    static int[] dy = { -1, 1, 2, 2, 1, -1, -2, -2 };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(grid, 0, 0, -1));
    }
    private static boolean solve(int[][] board, int r, int c, int prev) {
        if (r >= board.length || c >= board[0].length || r < 0 || c < 0 || (board[r][c] - prev) != 1)
            return false;
        if (board[r][c] == board.length * board[0].length - 1)
            return true;

        boolean temp = false;
        for (int i = 0; i < 8; i++) {
            temp = temp || solve(board, r + dx[i], c + dy[i], board[r][c]);
        }

        return temp;
    }
}
