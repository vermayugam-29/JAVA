import java.util.*;

public class LongestSubstrKUnique {
    public static void main(String[] args) {
        int ans = longestkSubstr("aabacbebebe",3);
        System.out.println(ans);
    }
    public static int longestkSubstr(String s, int k) {
        Map<Character,Integer> map = new HashMap();
        int i=0,j=0;
        int maxLen = -1;

        while(j < s.length()) {
            char chJ = s.charAt(j);
            map.put(chJ,map.getOrDefault(chJ,0)+1);

            if(map.size() < k) {
                j++;
            } else if(map.size() == k) {
                maxLen = Math.max(maxLen,(j-i+1));
                j++;
            } else {
                while(map.size() > k) {
                    char chI = s.charAt(i);
                    map.put(chI,map.get(chI)-1);
                    if(map.get(chI) == 0) map.remove(chI);
                    i++;
                }
                j++;
            }
        }
        return maxLen;
    }
}
