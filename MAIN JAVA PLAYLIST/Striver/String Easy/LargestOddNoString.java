import java.util.*;

public class LargestOddNoString {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(largestOddNumber(s));
        
    }
    public static String largestOddNumber(String s) {
        int idx = -1;
        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) %2 == 1){
                idx = i;
                break;
            }
        }
        if(idx == -1) {
            return "";
        }

     
        return s.substring(0,idx+1);
        
    
    }
}
