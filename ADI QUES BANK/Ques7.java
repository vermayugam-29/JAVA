import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(solve(s));
    }
    static String solve(String s){
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            for (int j = i+1; j <=s.length(); j++) {
                String a = s.substring(i,j);
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }

        int max = 0;
        String ans = "";
        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(e.getValue() == 3 && max < e.getKey().length()){
                max = e.getKey().length();
                ans = e.getKey();
            }
        }
        return ans.isEmpty() ? "Not So Cool" : ans;
    }
}
