import java.util.Scanner;

public class Ques19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solve(n));
    }
    static int solve(int n){
        if(n == 0){
            return 0;
        }
        if(n%2 == 0){
            return 1 + solve(n/2);
        }
        return 1 + solve(n-1);
    }
}
