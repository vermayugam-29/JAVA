import java.util.*;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "123";//sc.next();
//        solve("",str);
        StringBuilder sb = new StringBuilder(str);
        backTrack(sb,0);
        System.out.println(list);
    }
    //using backtracking-----------------------------------------------------------
    static void backTrack(StringBuilder sb,int idx){
        if(idx == sb.length()){
            list.add(sb.toString());
            return;
        }

        Set<Character> set = new HashSet<>();//using set to manage duplicates
        for(int i=idx;i<sb.length();i++){
            if(!set.contains(sb.charAt(i))){
                set.add(sb.charAt(i));
                swap(sb,idx,i);
                backTrack(sb,idx+1);
                swap(sb,idx,i);
            }
        }
    }
    static void swap(StringBuilder sb ,int s,int e){
        char temp = sb.charAt(s);
        sb.setCharAt(s,sb.charAt(e));
        sb.setCharAt(e,temp);
    }
    //Using recursion---------------------------------------------------------------
    static Set<String> list = new HashSet<>();
    static void solve(String p,String up){
        if(up.isEmpty()){
            list.add(p);
            return;
        }

        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<up.length();i++){
            if(map.get(up.charAt(i)) == null){
                map.put(up.charAt(i),1);
                String newUp = up.substring(0,i) + up.substring(i+1);
                String newP = p+up.charAt(i);
                solve(newP,newUp);
            }
        }
    }
}
