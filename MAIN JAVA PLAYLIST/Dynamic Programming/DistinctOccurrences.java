public class DistinctOccurrences {
    static int mod = 1000000007;
    static Integer[][] memo;
    static int solve(String s,String t){
        if(t.isEmpty()) return 1;
        if(s.isEmpty()) return 0;
        if(memo[s.length()-1][t.length()-1] != null) return memo[s.length()-1][t.length()-1] % mod;

        int cnt = 0;
        if(s.charAt(0) == t.charAt(0)){
            cnt = (cnt + solve(s.substring(1),t.substring(1))) % mod;
        }

        cnt = (cnt + solve(s.substring(1),t)) % mod;

        return memo[s.length()-1][t.length()-1] = cnt % mod;
    }

    public static void main(String[] args) {
        String s = "banana";
        String t = "ban";
        memo = new Integer[s.length()+1][t.length()+1];
        int ans =  solve(s,t);
    }
}
