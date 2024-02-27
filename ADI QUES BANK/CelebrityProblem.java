import java.util.Scanner;

public class CelebrityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solve(arr));
    }
    static int solve(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 1) count++;
            }
            if(count == 0) return i;
        }
        return -1;
    }
}
