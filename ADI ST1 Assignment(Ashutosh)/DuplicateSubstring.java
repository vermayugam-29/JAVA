import java.util.*;

public class DuplicateSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(substring(s));
    }
    static int substring(String s){
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String a = s.substring(i,j);
                map.put(a,map.getOrDefault(a,0)+1);
            }

        }

        int max = 0;
        for(Map.Entry<String,Integer> e: map.entrySet()){
            if(e.getValue()> max){
                max = e.getValue();
            }
        }
        String answer = "";
        int maxLen = 0;
        for(Map.Entry<String,Integer> e: map.entrySet()){
                if (maxLen < e.getKey().length() && max == e.getValue()) {
                    maxLen = e.getKey().length();
                    answer = e.getKey();
                }
        }
        System.out.println(answer);
        return max;
    }
}
