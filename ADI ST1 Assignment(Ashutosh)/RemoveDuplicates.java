import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(removeAll(s));
        System.out.println(removeConsecutive(s));
    }
    public static String removeAll(String s){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        String ans ="";
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            ans += e.getKey();
        }
        return ans;
    }
    public static String removeConsecutive(String s){
        String ans = "";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) != s.charAt(i+1)){
                ans += s.charAt(i);
            }
        }
        ans += s.charAt(s.length()-1);
        return ans;
    }
}
