import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(solve(s1,s2));
    }
    static boolean solve(String s1,String s2){
        //edge case
        if(s1.length() != s2.length()) return false;

        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(map.containsKey(ch1)){
                if(map.get(ch1) != ch2){
                    return false;
                }
            }
            else if(map.containsValue(ch2)){
                return false;
            }
            else {
                map.put(ch1,ch2);
            }
        }
        return true;
    }
}
