import java.util.Scanner;

public class LargestThreeDigitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLin;
        System.out.println(largestGoodInteger(s));
    }
    static String largestGoodInteger(String s) {
        String ans = ""
        int max = 0;

        for(int i=0 ;i < s.length() - 2 ;i++){
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)){
                ans = s.substring(i,i+3);
                max = Math.max(max,Integer.valueOf(ans));
            }
        }

        if(max == 0){
            return ans;
        }

        ans = String.valueOf(max);

        if(ans.equals("0")){
            return "";
        }
        return ans;
        
    }
}
