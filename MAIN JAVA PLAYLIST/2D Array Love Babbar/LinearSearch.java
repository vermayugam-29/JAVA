import java.util.Scanner;

public class LinearSearch {
    static boolean isPresent(int[][] arr,int target,int row ,int col){

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(arr[i][j] == target){
                    return true;
                }
            }
        }

        return false;
    }


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

        int target = sc.nextInt();

        //function checks if target is present in 2d array or not
        if(isPresent(arr,target,row,col)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
