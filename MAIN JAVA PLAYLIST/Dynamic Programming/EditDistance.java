import java.util.Arrays;

public class EditDistance {
    static int[][] memo;
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";
        memo = new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        int ans = solve(word1,word2,0,0);
        System.out.println(ans);
    }
    private static int solve(String s1,String s2,int i,int j){
        if(i >= s1.length()){
            return s2.length()-j;
        } if(j >= s2.length()){
            return s1.length()-i;
        }
        if(memo[i][j] != -1) return memo[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            return solve(s1,s2,i+1,j+1);
        }

        int insert = 1 + solve(s1,s2,i,j+1);
        int delete = 1 + solve(s1,s2,i+1,j);
        int replace = 1 + solve(s1,s2,i+1,j+1);

        return memo[i][j] = Math.min(insert,Math.min(delete,replace));
    }
}
