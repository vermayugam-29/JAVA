import java.util.Scanner;

public class FrogJumpKDistances {
    static Integer[] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        memo = new Integer[n+1];
        System.out.println(solve(arr,0,k));
    }
    private static int solve(int[] arr,int i,int k){
        if(i == arr.length - 1){
            return 0;
        }
        if(memo[i] != null) return memo[i];

        int min = Integer.MAX_VALUE;

        for(int j=1;j<=k;j++){
            if(i+j < arr.length){
                min =  Math.min(solve(arr, i+j, k) + Math.abs(arr[i] - arr[i+j]), min);
            }
        }

        return memo[i]= min;
    }
}
