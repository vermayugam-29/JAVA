import java.util.Scanner;

public class Ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(solve(s));
    }
    static String solve(String s){
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(i %2 == 0){
                char ch = (char)(s.charAt(i) + 1);
                ans += ch;
            }
            else{
                char ch = (char)(s.charAt(i) - 1);
                ans += ch;
            }
        }
        return ans;
    }
}
