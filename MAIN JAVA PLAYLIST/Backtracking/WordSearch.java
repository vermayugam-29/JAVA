import java.util.Scanner;

public class WordSearch {
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static int m,n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        char[][] board = new char[m][n];

        for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        String word = sc.next();
        System.out.println(helper(board,word));
    }
    private static boolean solve(char[][] board,int r,int c,String word,int k){
        if(k >= word.length()) return true;
        if(r >= m || c >= n || r < 0 || c < 0 || board[r][c] == '0' || word.charAt(k) != board[r][c]) return false;
        board[r][c] = '0';

        boolean  temp = false;

        for(int i=0;i<4;i++){
            temp = temp || solve(board,r+dx[i],c+dy[i],word,k+1);
        }

        board[r][c] = word.charAt(k);
        return temp;
    }
    private static boolean helper(char[][] board,String word){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0) == board[i][j]){
                    if(solve(board,i,j,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
