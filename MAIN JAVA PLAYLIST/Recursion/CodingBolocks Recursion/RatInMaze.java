import java.util.*;
public class RatInMaze {
    static int count = 0;
    //taking input-----------------------------------------------------
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        char[][] maze = new char[row][col];
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            maze[i] = sc.next().toCharArray();
        }
        boolean flag = true;
        if(maze[row-1][col-1] == 'X') {
            flag = false;
            System.out.println("-1");
        }
        else if(flag)backtrack("",maze,0,0,arr);
        else if(flag && count == 0) System.out.println("-1");

    }
    //backtracking function----------------------------
    static void backtrack(String p,char[][] maze,int r,int c,int[][] arr){
        if(r == maze.length-1 && c==maze[0].length-1){
            count = count + 1;
            arr[r][c] = 1;
            if(count == 1) print(arr,maze);
            return;
        }

        if(maze[r][c] == 'X') return;

        maze[r][c] = 'X';//mark as visited
        arr[r][c] = 1;

        if(c < maze[0].length-1) backtrack(p+"Right",maze,r,c+1,arr);
        if(r < maze.length-1) backtrack(p+"Down",maze,r+1,c,arr);

        maze[r][c] = 'O';//backtrack now and mark as not visited
        arr[r][c] = 0;
    }
    //printing our array
    static void  print(int[][] arr,char[][] maze){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
