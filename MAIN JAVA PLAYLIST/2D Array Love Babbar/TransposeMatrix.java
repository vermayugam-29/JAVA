import java.util.Scanner;

public class TransposeMatrix {
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

        int[][] ans = transpose(arr,row,col);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[ans.length-1].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] transpose(int[][] arr,int row,int col){
        int[][] answer = new int[col][row];

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                answer[i][j] = arr[j][i];
            }
        }

        return answer;
    }
}
