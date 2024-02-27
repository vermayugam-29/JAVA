import java.util.Arrays;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2d = new int [3][2];

        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                arr2d[row][col] = sc.nextInt();
            }
        }
        for (int row = 0; row < arr2d.length; row++) {
            System.out.println(Arrays.toString(arr2d[row]));
        }
    }
}
