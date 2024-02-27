import java.util.Scanner;

public class RotateImage {
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

        int[][] ans = Rotate(arr,row,col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] +" ");
            }
            System.out.println();
        }

    }
    static int[][] Rotate (int[][] arr,int row,int col){
        int x = 0;
        int y = 0;

        int[][] ans = new int[row][col];

        for (int i = row-1; i >= 0; i--) {
            x = 0;
            for (int j = 0; j < col; j++) {
                ans[x][y] = arr[i][j];
                x++;
            }
            y++;
        }

        return ans;
    }
}
