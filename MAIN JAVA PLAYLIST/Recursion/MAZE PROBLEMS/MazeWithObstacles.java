import java.util.Scanner;

public class MazeWithObstacles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] maze = new int[row][col];

        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        path("",maze,row-1,col-1);

    }
    static void path(String p,int[][] maze,int row,int col){
        if(row == 0  && col == 0){
            System.out.println(p);
            return;
        }

        //if obstacles (or -1) comes just skip and don't go forward
        if(maze[row][col] == -1) return;

        //first go Horizontal or right
        if(col > 0) path(p+"R",maze,row,col-1);
        //then go Vertical or down
        if(row > 0) path(p+"D",maze,row-1,col);
    }
}
