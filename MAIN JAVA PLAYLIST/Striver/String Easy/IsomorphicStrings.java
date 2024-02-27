import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(AreIsomorphic(s, t));
    }
    public static boolean AreIsomorphic(String s, String t){
        HashMap<Character,Character> map1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character sCh = s.charAt(i); //for chatAt s
            Character tCh = t.charAt(i); //for chatAt t

            //eg :- key =foo , value = bar, at i=2 for sCh this condition will occur
            if(map1.containsKey(sCh)){
                if(map1.get(sCh) != tCh){
                    return false;
                }
            }
            //---eg: key  = foo, value = bob at i=2 because b is already assigned to f but it exist
            // corresponding to o so return false
            //eg key = badc and value = baba
            else if(map1.containsValue(tCh)){
                return false;
            }
            //adding values and key to map
            else{
                map1.put(sCh,tCh);
            }
        }
        return true;
    }
}
