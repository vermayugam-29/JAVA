import java.util.Arrays;
import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr1 = new int[n][k];
        int[][] arr2 = new int[n][k];
        int[][] sum = {
                          {0,0,0},
                          {0,0,0}
                       };
                       System.out.println("Enter elements of  array 1 : ");
        for (int i = 0; i < arr1.length; i++) {  // i = no. of rows
            for (int j = 0; j < arr1[i].length; j++) { // j = no. of columns
                arr1[i][j] = sc.nextInt();
                
            }
        }
        System.out.println("Enter elements of  array 2 : ");
        for (int i = 0; i < arr1.length; i++) {  // i = no. of rows
            for (int j = 0; j < arr1[i].length; j++) { // j = no. of columns
                arr2[i][j] = sc.nextInt();
                
            }
        }
        for (int i = 0; i < arr1.length; i++) {  // i = no. of rows
            for (int j = 0; j < arr1[i].length; j++) { // j = no. of columns

                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("");
        }
                 
        
       /*  for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
            
        }*/
    }
}
