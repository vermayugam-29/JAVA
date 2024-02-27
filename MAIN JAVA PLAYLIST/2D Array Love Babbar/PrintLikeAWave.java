import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintLikeAWave {
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

        Wave(arr,row,col);
    }
    //my approach ------------------------------------------------------------------------------
    static void Wave(int[][] arr,int row,int col){
        int pass = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < col; i++) {
            if(pass%2 == 0){
                for (int j = 0; j < row; j++) {
                    list.add(arr[j][i]);
                }
                pass++;
            }
            else{
                for (int j = row - 1; j >= 0; j--) {
                    list.add(arr[j][i]);
                }
                pass++;
            }
        }

        System.out.println(list);
    }
}
