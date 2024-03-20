public class IntersectionOf2Strings {
    static String[][] memo = new String[100][100];
    public static void main(String[] args) {
        String ans = solve("abcd","ghjfhfgfhfadbc");
        System.out.println(ans);
    }
    private static String solve(String s,String t){
        if(t.isEmpty() || s.isEmpty()) return "";
        if(memo[s.length()][t.length()] != null) return "";
        String ans = "";
        if(s.charAt(0) == t.charAt(0)){
            ans += s.charAt(0) +solve(s.substring(1),t.substring(1));
        }
        ans += solve(s,t.substring(1));
        ans += solve(s.substring(1),t);
        return memo[s.length()][t.length()] = ans;
    }
}