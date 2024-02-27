import java.util.Scanner;

public class SetMatrixZero {
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
    static int[][] MatrixZero(int[][] arr,int row,int col){

        int[] rowArray = new int[row];
        int[] colArray = new int[col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j] == 0){
                    rowArray[i] = 1;
                    colArray[j] = 1;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rowArray[i] == 1 || colArray[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }

        return arr;
    }
}
