import java.util.ArrayList;
import java.util.Scanner;

public class RatInMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int[][] maze = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        ArrayList<String> list = new ArrayList<>();
        //edge case if end point is zero just return empty list
        if(maze[row-1][row-1] == 0){
            System.out.println(list);
            return;
        }
        solve("",maze,0,0,list);
        System.out.println(list);
    }
    static void solve(String p, int[][] maze, int r, int c, ArrayList<String> list){
        if(r == maze.length-1 && c == maze.length-1){
            maze[r][c] = 1;
            list.add(p);
            return;
        }

        if(maze[r][c] == 0) return;

        //mark visited as 1
        maze[r][c] = 0;

        if(r < maze.length-1){
            solve(p+"D",maze,r+1,c,list);
        }
        if(c < maze[0].length-1){
            solve(p+"R",maze,r,c+1,list);
        }
        if(r > 0){
            solve(p+"U",maze,r-1,c,list);
        }
        if(c > 0){
            solve(p+"L",maze,r,c-1,list);
        }

        //undoing changes (or BACKTRACKING)
        maze[r][c] = 1;
    }
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static char[] ch = {'D','R','U','L'};
    static ArrayList<String> list2;

    public static ArrayList<String> findPath(int[][] m, int n) {
        list2 = new ArrayList<>();
        if(m[n-1][n-1] == 0) return list2;
        solve(m,0,0,"",n);
        return list2;
    }
    static void solve(int[][] board,int r,int c,String op,int m){
        if(r == m-1 && c == m-1){
            list2.add(op);
            return;
        }
        if(r < 0 || c < 0 || r >= m || c >= m || board[r][c] == 0) return;


        for(int i=0;i<4;i++){
            board[r][c] = 0;
            solve(board,r+dx[i],c+dy[i],op+ch[i],m);
            board[r][c] = 1;
        }
    }
}
