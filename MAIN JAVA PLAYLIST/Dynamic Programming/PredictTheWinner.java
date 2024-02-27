import java.util.Scanner;

public class PredictTheWinner {
    private static int solve1(int[] arr,int s,int e){
        if(s > e)
            return 0;

        //PLAYER1 -PLAYER2
        int takeS = arr[s] - solve1(arr,s+1,e);
        int takeE = arr[e] - solve1(arr,s,e-1);

        return Math.max(takeS,takeE);
    }
    private static int solve2(int[] arr,int s,int e){
        if(s > e)
            return 0;

        //PICK UP YOUR BEST i.e(arr[s] or arr[e]) but in left hope for worst because player2 will also
        //pick his best
        int takeS = arr[s] + Math.min(solve2(arr,s+2,e),solve2(arr,s+1,e-1));
        int takeE = arr[e] + Math.min(solve2(arr,s+1,e-1),solve2(arr,s,e-2));

        return Math.max(takeS,takeE);
    }
    public static boolean approach1(int[] arr,int n){
        return solve2(arr,0,n-1) >= 0;
    }
    public static boolean approach2(int[] arr,int n){
        int total = 0;
        for (int i : arr){
            total += i;
        }
        int Player1_score = solve2(arr,0,n-1);
        int Player2_score = total - Player1_score;

        return Player1_score >= Player2_score;
    }
    //BOILER PLATE
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        Boolean ans1 = approach1(arr,n);
        Boolean ans2 = approach2(arr,n);
        System.out.println(ans1);
    }
}
