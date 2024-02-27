import java.util.Scanner;

public class ShinChanQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
         while(test_case-- > 0){
             int num = sc.nextInt();
             int k = sc.nextInt();
             int ans = solve(num,k);
             System.out.println(ans);
         }
    }
    static int solve(int num,int k){
        if(k == 0) return num;
        if(num%10 == 0){
            return solve(num/10,k-1);
        }
        return solve(num-1,k-1);
    }
}
