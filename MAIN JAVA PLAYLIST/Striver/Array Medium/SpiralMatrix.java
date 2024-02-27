import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
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
        SpiralOrderPrinting(arr,row,col);

    }
    static void SpiralOrderPrinting(int[][] arr, int row, int col){
        List<Integer> list = new ArrayList<>();

        int count = 0; //no of elements currently added to list
        int total = row*col;//max elements needed to add in list

        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row - 1;
        int endingCol = col - 1;

        //eg :-
        //1  2  3
        //4  5  6
        //7  8  9
        while(count < total){
            //print the starting row first i.e = 1,2,3
            for(int i=startingCol;count < total && i<=endingCol;i++){
                list.add(arr[startingRow][i]); //keeping row same and iterating on col
                count++;
            }
            startingRow++;

            //printing ending column i.e 6,9
            for(int i=startingRow;count < total && i<=endingRow;i++){
                list.add(arr[i][endingCol]);
                count++;
            }
            endingCol--;

            //printing ending row i.e 8,7
            for(int i=endingCol;count < total && i>=startingCol;i--){
                list.add(arr[endingRow][i]);
                count++;
            }
            endingRow--;

            //printing starting col i.e 4
            for(int i=endingRow;count < total && i>=startingRow;i--){
                list.add(arr[i][startingCol]);
                count++;
            }
            startingCol++;
        }


        System.out.println(list);
    }
}
