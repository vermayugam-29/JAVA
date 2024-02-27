import java.util.Arrays;
import java.util.Scanner;

public class MatrixPathPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] maze = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        int[][] ans = new int[row][col];

        printPath("",maze,0,0,ans,1);
    }

    static void printPath(String p,int[][] maze,int r,int c,int[][] ans,int count){
        if(r == maze.length-1 && c == maze[0].length-1){
            //we did this because if we don't do this will not count the last ending path
            ans[r][c] = count;
            for(int[] arr : ans){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(maze[r][c] == -1) return;

        maze[r][c] = -1;
        //adding count to curr row and col of our answer array
        ans[r][c] = count;

        if(r < maze.length-1) printPath(p+"D",maze,r+1,c,ans,count+1);

        if(c < maze[0].length-1) printPath(p+"R",maze,r,c+1,ans,count+1);

        if(r > 0) printPath(p+"U",maze,r-1,c,ans,count+1);

        if(c > 0) printPath(p+"L",maze,r,c-1,ans,count+1);

        maze[r][c] = 1;
        //removing count from our answer array
        ans[r][c] = 0;
    }
}
