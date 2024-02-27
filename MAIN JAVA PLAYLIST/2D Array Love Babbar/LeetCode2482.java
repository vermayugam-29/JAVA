import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LeetCode2482 {
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
    }
    static public int[][] onesMinusZeros(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] ans = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                putting(arr,ans,i,j,row,col);
            }
        }
        return ans;
    }
    static void putting(int[][] arr,int[][] ans,int currRow,int currCol,int  row,int col){
        int cntZero = 0;
        int cntOne = 0;

        int i = 0;
        int j = 0;

        while(j<=row && i<=col){
            if(i >= col){
                if(j<row && arr[j][currCol] == 0){
                    cntZero++;
                }
                else if(j<row && arr[j][currCol] == 1){
                    cntOne++;
                }
                j++;
            }
            if(i < col){
                if(i<col && arr[currRow][i] == 0){
                    cntZero++;
                }
                else if(i<col &&arr[currRow][i] == 1){
                    cntOne++;
                }
                i++;
            }
        }
        ans[currRow][currCol] = cntOne - cntZero;
    }
}
