import java.util.*;

public class Ques37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(solve(s));
    }
    static char solve(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max = 0;
        char ans = s.charAt(0);
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                ans = e.getKey();
            }
        }
        return ans;
    }
}
