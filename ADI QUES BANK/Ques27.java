import java.util.*;

public class Ques27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        Set<String> set = subString(str1);

        subseq("",str2,set);
        System.out.println(max);
    }
    static int max = 0;
    static void subseq(String p,String up,Set<String> set){
        if(up.isEmpty()){
            if(set.contains(p)){
                max = Math.max(p.length(),max);
            }
            return;
        }

        //take character
        subseq(p + up.charAt(0),up.substring(1),set);
        //ignore character
        subseq(p ,up.substring(1),set);
    }
    static Set<String> subString(String str1){
        Set<String> set = new HashSet<>();
        for (int i = 1; i <= str1.length(); i++) {
            set.add(str1.substring(0,i));
        }
        return set;
    }
}
