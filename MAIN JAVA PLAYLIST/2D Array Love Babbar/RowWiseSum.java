import java.util.Arrays;
import java.util.Scanner;

public class RowWiseSum {
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

        System.out.println(Arrays.toString(RowSum(arr, row, col)));
        System.out.println(Arrays.toString(ColSum(arr,row,col)));

    }
    static int[] RowSum(int[][] arr,int row,int col){
        int[] sum = new int[row];
        int a = 0;
        int k = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a +=  arr[i][j];
            }
            sum[k++] = a;
            a = 0;
        }

        return sum;
    }
    static int[] ColSum(int[][] arr,int row,int col){
        int[] sum = new int[col];
        int a = 0;
        int k = 0;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                a += arr[j][i];
            }
            sum[k++]= a;
            a = 0;
        }

        return sum;
    }
}
