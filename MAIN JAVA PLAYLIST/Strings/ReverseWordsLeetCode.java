import java.util.Scanner;

public class ReverseWordsLeetCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";
        StringBuilder sb = new StringBuilder("");
        int n = str.length();

        for (int i = n-1; i >=0; i--) {
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }
            else{
                sb.reverse();
                ans += sb +" ";
                sb.setLength(0);
            }
        }
        ans += sb;
        System.out.println(ans);
    }
}
