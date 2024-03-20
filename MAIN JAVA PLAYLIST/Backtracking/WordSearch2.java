import java.util.*;

public class WordSearch2 {
    static int[] dx = {-1,-1,-1,0,1,1,1,0};
    static int[] dy = {-1,0,1,1,1,0,-1,-1};
    static Set<String> set = new HashSet<>();
    static int n,m;
    public static void wordBoggle(char[][] board, String[] words) {
        n = board.length;m = board[0].length;

        for(int ch=0;ch<words.length;ch++){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(words[ch].charAt(0) == board[i][j]) {
                        dfs(board,i,j,words[ch],0);
                    }
                }
            }
        }
        System.out.println(set);
    }
    private static void dfs(char[][] board,int r,int c,String s,int i){
        if(i >= s.length()){
            set.add(s);
            return;
        }
        if(r >= n || c >= m || r < 0 || c < 0 || board[r][c] == '.' || board[r][c] != s.charAt(i)){
            return;
        }

        char ch = board[r][c];
        board[r][c] = '.';

        for(int idx=0;idx<8;idx++){
            dfs(board,r+dx[idx],c+dy[idx],s,i+1);
        }

        board[r][c] = ch;
    }

    public static void main(String[] args) {
        char[][] board = {{'C','A','P'},{'A','N','D'},{'T','I','E'}};
        String[] arr = {"CAT"};
        wordBoggle(board,arr);
    }
}
