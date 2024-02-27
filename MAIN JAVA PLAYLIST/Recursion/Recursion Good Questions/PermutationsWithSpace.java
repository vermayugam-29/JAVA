public class PermutationsWithSpace {
    public static void main(String[] args) {
        solve("a","bc");
    }
    static void solve(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        //either add space
        solve(p+" " + up.charAt(0) , up.substring(1));
        //or ignore space
        solve(p + up.charAt(0),up.substring(1));
    }
}
