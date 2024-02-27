import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solve(str));
    }
    static int solve(String up){
        if(up.isEmpty()){
            return 1;
        }

        int one = 0;
        if(up.charAt(0) != '0') one = solve(up.substring(1));
        int two = 0;
        if(up.length() >= 2 && up.charAt(0) != '0'){
            int b = Integer.parseInt(up.substring(0,2));
            if(b <= 26) two = solve(up.substring(2));
        }
        return one+two;
    }
}
