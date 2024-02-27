import java.util.*;
public class CamelCase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ans= "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch <= 90){
                ans += " ";
            }
            ans = ans + ch;
        }
        ans = ans.trim();

        String[] arr = ans.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}