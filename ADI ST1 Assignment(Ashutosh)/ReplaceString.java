import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String s1 = sc.next();
        String s2 = sc.next();

        String ans = str.replaceAll(s1,s2);
        System.out.println(ans);
    }
}
