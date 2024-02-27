import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumber {
    static Map<Character,String> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String n = sc.next();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        solve("","233");

    }
    static void solve(String p,String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        String s = map.get(up.charAt(0));
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            solve(p + ch,up.substring(1));
        }
    }

}
