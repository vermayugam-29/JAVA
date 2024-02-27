import java.util.Arrays;
import java.util.Scanner;

public class SearchinTwoDArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// rows
        int k = sc.nextInt();//columns
        int[][] arr2 = new int[n][k];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int[] i : arr2) {
            System.out.println(Arrays.toString(i));
        }
    }
}
