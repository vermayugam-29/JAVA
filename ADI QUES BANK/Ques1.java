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

        solve(arr,0,0,0,maxCap);//approach 1
        System.out.println(max);

        int ans = solve2(arr,0,0,maxCap);//approach 2
        System.out.println(ans);
    }
    //1stApproach-----------------------------------------------------------------------------------
    static int max = 0;
    static void solve(int[][] arr,int i,int cap,int profit,int maxCap){
        if(i == arr.length){
            max = Math.max(max,profit);
            return;
        }

        //include
        if(cap + arr[i][0] <= maxCap){
            solve(arr,i+1,cap+arr[i][0],profit + arr[i][1],maxCap);
        }
        //exclude
        solve(arr,i+1,cap,profit ,maxCap);
    }
    //2nd Approach--------------------------------------------------------------------------------
    static int solve2(int[][] arr,int i,int cap,int maxCap){
        if(i == arr.length){
            return 0;
        }

        int include = 0;
        if(cap + arr[i][0] <= maxCap){
            include = arr[i][1] + solve2(arr,i+1,cap+arr[i][0],maxCap);
        }
        int exclude = solve2(arr,i+1,cap,maxCap);

        return Math.max(include,exclude);

    }
}
