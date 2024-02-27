import java.util.*;
public class LargestRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new  int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        LargestRow(arr,row,col);
        LargestCol(arr,row,col);


    }
    static void LargestRow(int[][] arr,int row,int col){

        int maxSum = Integer.MIN_VALUE;
        int idx = 0;


        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            if(maxSum < sum){
                maxSum = sum;
                idx = i;
            }
        }

        System.out.println(maxSum);
        System.out.println(idx);
    }

    static void LargestCol(int[][] arr,int row,int col){
        int maxSum = Integer.MIN_VALUE;
        int idx = 0;

        for (int i = 0; i < col; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                sum += arr[j][i];
            }
            if(maxSum < sum){
                maxSum = sum;
                idx = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(idx);
    }
}