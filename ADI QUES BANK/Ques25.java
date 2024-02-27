import java.util.Scanner;

public class Ques25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String a = "";
        int n = sc.nextInt();
        while(n-- > 0){
            String s = sc.next();
            a += s;
        }
        System.out.println(solve(word,a));
    }
    static boolean solve(String word,String str){
        if(str.isEmpty()) return false;
        if(str.startsWith(word)){
            return true;
        }
        return solve(word,str.substring(1));
    }
}
