import java.util.Scanner;

public class Ques17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
    }
    static String solve(String s){
        String ans = "" + s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            int num1 = s.charAt(i-1);
            int num2 = s.charAt(i);
            int diff = num2 - num1;
            ans += diff;
            ans += s.charAt(i);
        }
        return ans;
    }
}
