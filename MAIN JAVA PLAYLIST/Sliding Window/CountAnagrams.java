import java.util.*;

//https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1
public class CountAnagrams {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(SlidingWindow(a,b));
    }

    private static int SlidingWindow(String str,String a){

        //map of String a
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int j = 0;
        int k = a.length(); //window size
        int count = map.size();
        int ans = 0;

        //eg:- forcorfdorf
        // for
        //output : 3
        while(j < str.length()){
            char chJ = str.charAt(j);
            char chI = str.charAt(i);

            if(map.containsKey(chJ)){
                map.put(chJ,map.get(chJ)-1);
                if(map.get(chJ) == 0){
                    count--;
                }
            }

            //window currently didn't reach its size
            if(j-i+1 < k){
                j++;
            }

            //when window reaches its size
            else if(j-i+1 == k){
                if(count == 0){
                    ans++;
                }
                if(map.containsKey(chI)){
                    if(map.get(chI) == 0){
                        count++;
                    }
                    map.put(chI,map.get(chI)+1);
                }

                //sliding the  window
                i++;
                j++;
            }
        }


        return ans;
    }
}