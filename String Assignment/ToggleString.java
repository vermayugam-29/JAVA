import java.util.*;
public class ToggleString {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ans = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 65 && ch<= 90){
                ans += Character.toLowerCase(ch);
            }
            else{
                ans += Character.toUpperCase(ch);
            }
        }
        System.out.println(ans);
    }
}
