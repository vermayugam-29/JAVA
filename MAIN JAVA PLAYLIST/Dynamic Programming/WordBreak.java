import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordBreak {
    static Boolean[] memo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "yugam";//sc.next();
//        int n = sc.nextInt();
        List<String> list = List.of("yuga","yug","ver","am","ma");//new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            list.add(sc.next());
//        }
        memo = new Boolean[s.length()+1];
        boolean ans = solve(s,0,list);
    }
    private static boolean solve(String str, int start, List<String> list){
        if(start >= str.length()) return true;
        if(memo[start] != null) return memo[start];

        for(int i=start;i < str.length();i++){
            if(list.contains(str.substring(start,i+1))){
                if(solve(str,i+1,list)){
                    return memo[start] =true;
                }
            }
        }
        return memo[start] =false;
    }
}
