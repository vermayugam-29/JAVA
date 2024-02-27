import java.util.*;
public class StringCompression {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String ans = "" + s.charAt(0);
        int count = 1;

        for(int i=1;i<s.length();i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);

            if(curr == prev){
                count++;
            }
            else{
                ans += count;
                count = 1;
                ans += curr;
            }
        }
        ans += count;
        System.out.print(ans);
    }
}