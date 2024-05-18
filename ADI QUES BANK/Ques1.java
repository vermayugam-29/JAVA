import java.util.Scanner;
//0/1 KNAPSACK PROBLEM
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();//row
        int col = 2; //col

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxCap = sc.nextInt();

        int ans = solve(arr,0,0,maxCap);
        System.out.println(ans);

    }
    //2nd Approach--------------------------------------------------------------------------------
    static int solve(int[][] arr,int i,int cap,int maxCap){
        if(i == arr.length){
            return 0;
        }

        int include = 0;
        if(cap + arr[i][0] <= maxCap){
            include = arr[i][1] + solve(arr,i+1,cap+arr[i][0],maxCap);
        }
        int exclude = solve(arr,i+1,cap,maxCap);

        return Math.max(include,exclude);

    }
}
