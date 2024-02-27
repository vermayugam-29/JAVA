import java.util.Arrays;

public class CountSortedVowels {
    static int[][] memo;
    static char[] arr = {'a','e','i','o','u'};
    public static void main(String[] args) {
        int n = 2;
        memo = new int[n+1][27];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        int cnt = 0;
        for(char ch : arr){
            cnt += solve(n,ch);
        }
        System.out.println(cnt);
    }
    static int solve(int n,char prev){
        if(n == 1) return 1;
        if(memo[n][prev-'a'] != -1) return memo[n][prev-'a'];

        int ans = 0;
        for(char ch : arr){
            if(prev >= ch){
                ans += solve(n-1,ch);
            }
        }
        return memo[n][prev-'a'] = ans;
    }
}
