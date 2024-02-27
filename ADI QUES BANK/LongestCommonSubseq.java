import java.util.*;
public class LongestCommonSubseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();

//        Set<String> set = new HashSet<>();
//        subseq1("",text1,set);
//        subseq2("",text2,set);
//        System.out.println(max);
        System.out.println(solve(text1,text2));
    }
    static int solve(String s1,String s2){
        if(s1.isEmpty() || s2.isEmpty()){
            return 0;
        }

        if(s1.charAt(0) == s2.charAt(0)){
            return 1 + solve(s1.substring(1),s2.substring(1));
        }
        else{
            return Math.max(solve(s1.substring(1),s2) , solve(s1,s2.substring(1)));
        }
    }
}
//    static int max = Integer.MIN_VALUE;
//    static void subseq1(String p,String up,Set<String> set){
//        if(up.isEmpty()){
//            set.add(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//
//        subseq1(p + ch, up.substring(1),set);
//        subseq1(p, up.substring(1),set);
//    }
//    static void subseq2(String p,String up,Set<String> set){
//        if(up.isEmpty()){
//            if(set.contains(p)) max = Math.max(max,p.length());
//            return;
//        }
//
//        char ch = up.charAt(0);
//
//        subseq2(p + ch, up.substring(1),set);
//        subseq2(p, up.substring(1),set);
//    }
