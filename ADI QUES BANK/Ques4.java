import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[row][col];
        backTrack(arr,0,0,0,visited);
        System.out.println(max);
    }
    static int max = 0;
    static void backTrack(int[][] arr,int row,int col,int profit,boolean[][] visited){
        if(row == arr.length-1 && col == arr[0].length-1){
            profit = profit + arr[row][col];
            max = Math.max(profit,max);
            return;
        }

        if(visited[row][col]) return; //true means that they are blocked

        visited[row][col] = true;//mark as visited

        if(row < arr.length-1){//move down
            backTrack(arr,row+1,col,profit+arr[row][col],visited);
        }
        if(col < arr[0].length-1){//move right
            backTrack(arr,row,col+1,profit+arr[row][col],visited);
        }
        //now backtrack and mark as not visited
        visited[row][col] = false;
    }
}
