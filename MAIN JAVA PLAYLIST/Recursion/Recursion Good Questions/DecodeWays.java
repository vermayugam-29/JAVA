import java.util.Scanner;

public class DecodeWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve("12259","");
    }
    static void solve(String ip,String op){
        if(ip.isEmpty()){
            System.out.print(op + " ");
            return;
        }
        char ch = ip.charAt(0);
        if(ch!= '0') solve(ip.substring(1),op + map[ch-'0']);
        if(ip.length() >= 2 && ch != '0'){
            int idx = Integer.parseInt(ip.substring(0,2));
            if(idx < 27 ) solve(ip.substring(2),op + map[idx]);
        }
    }
    static char[] map = {'0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v',
                            'w','x','y','z'};
}
