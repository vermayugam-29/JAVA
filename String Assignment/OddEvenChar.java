import java.util.*;
public class OddEvenChar {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ans = "";
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            int x = curr ;
            System.out.println(x);
            if(i%2 == 0){
                ans += (char)(x + 1);
            }
            else{
                ans += (char)(x - 1);
            }
        }
        System.out.print(ans);
    }
}
