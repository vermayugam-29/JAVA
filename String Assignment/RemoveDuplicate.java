import java.util.*;
public class RemoveDuplicate {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String ans = "";

        for(int i=0;i<s.length()-1;i++){
            char curr = s.charAt(i);
            char next = s.charAt(i+1);

            if(curr != next){
                ans += curr;
            }
        }
        ans += s.charAt(s.length()-1);
        System.out.println(ans);
    }
}
