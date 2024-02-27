import java.util.Arrays;
import java.util.Scanner;

public class AllPaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int row = sc.nextInt();
//        int col = sc.nextInt();
//
//        int[][] maze = new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                maze[i][j] = sc.nextInt();
//            }
//        }
        int[][] maze = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        paths("",maze,0,0);
    }
    static void paths(String p,int[][] maze,int row,int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(maze[row][col] == -1){
            return;
        }

        //marking visited blocks as -1 (or false)
        maze[row][col] = -1;

        if(row < maze.length-1){
            paths(p + "D",maze,row+1,col);
        }
        if(col < maze[0].length-1){
            paths(p + "R",maze,row,col+1);
        }
        if(row > 0){
            paths(p + "U",maze,row-1,col);
        }
        if(col > 0){
            paths(p+"L",maze,row,col-1);
        }

        //Reverting the changes we made:-
        //this means we are undoing changes i.e. that what we did -1 we are marking them no  as 1
        maze[row][col] = 1;
    }
}
