import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String a = sc.next();


        boolean ans = AnagramOrNot(s,a);

        System.out.println(ans);
    }
    public static boolean AnagramOrNot(String s,String a){
        if(s.length() != a.length()){
            return false;
        }
        //1st  method---------------------------------------------------------------------------------------------
        // HashMap<Character,Integer> map1 = map(s);
        // HashMap<Character,Integer> map2 = map(a);
        // return map1.equals(map2);

        //2nd  method--------------------------------------------------------------------------------------------
        HashMap<Character,Integer> map1 = map(s);

        for (char e : a.toCharArray()) {
            if(!map1.containsKey(e)){
                return false;
            }
            else{
                map1.put(e,map1.get(e)-1);
            }
        }

        for (Integer i : map1.values()) {
            if(i != 0){
                return false;
            }
        }
        return true;
    }
    public static HashMap<Character,Integer> map(String str){
        HashMap<Character , Integer> map = new HashMap<>();
        for (char e : str.toCharArray()) {
            if(!map.containsKey(e)){
                map.put(e,1);
            }
            else{
                map.put(e, map.get(e)+1);
            }
        }
        return map;
    }
}
