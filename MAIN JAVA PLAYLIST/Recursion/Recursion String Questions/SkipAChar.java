import java.util.Scanner;

public class SkipAChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "abcdfefdsaavaa";
        char ch = 'a';
        System.out.println(remove(s,ch,0,""));
        System.out.println(skip(s));
    }
    static String remove(String s,char ch,int idx,String ans){
        if(idx == s.length()) return ans;
        if(s.charAt(idx) != ch){
            ans += s.charAt(idx);
        }
        return remove(s,ch,idx+1,ans);
    }
    static String skip(String s){
        if(s.isEmpty()) return "";

        char ch = s.charAt(0);
        if(ch == 'a'){
            return skip(s.substring(1));
        }
        return ch + skip(s.substring(1));
    }
}
