import java.util.*;

public class LongestUniqueSubstr {
    public static void main(String[] args) {
        int ans = lengthOfLongestSubstring("abcabcbb");
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap();
        int i = 0, j = 0;
        int maxLen = 0;

        while(j < s.length()) {
            char chJ = s.charAt(j);
            map.put(chJ,map.getOrDefault(chJ,0)+1);

            if(map.size() == (j-i+1)) {
                maxLen = Math.max(maxLen,(j-i+1));
            } else {
                while(map.size() != (j-i+1)){
                    char chI = s.charAt(i);
                    map.put(chI,map.get(chI)-1);
                    if(map.get(chI) == 0) map.remove(chI);
                    i++;
                }
            }
            j++;
        }
        return maxLen;
    }
}
