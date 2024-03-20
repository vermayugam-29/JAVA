public class LargestNumberKSwaps {
    static String ans;
    public static void main(String[] args) {
        String  str = "1234567";
        int k = 4;
        ans = str;
        dfs(new StringBuilder(str),k,0);
        System.out.println(ans);
    }
    private static void dfs(StringBuilder sb,int k,int start){
        if(k==0 || start >= sb.length()){
            return;
        }

        for (int i = start+1; i < sb.length(); i++) {
            if(sb.charAt(start) < sb.charAt(i)){
                swap(sb,i,start);
                if(ans.compareTo(sb.toString()) < 0){
                    ans = sb.toString();
                }
                dfs(sb,k-1,start+1);
                swap(sb,i,start);
            }
        }
        dfs(sb,k,start+1);
    }
    private static void swap(StringBuilder sb,int i,int j){
        char temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
    }
}
