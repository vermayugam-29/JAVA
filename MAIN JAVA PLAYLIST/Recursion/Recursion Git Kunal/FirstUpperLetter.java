import java.util.Scanner;

public class FirstUpperLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(upperCase(s,0));
    }
    static Character upperCase(String s,int idx){
        if(idx == s.length()) return '0';
        if(s.charAt(idx) >= 65 && s.charAt(idx) <= 90) return s.charAt(idx);
        return upperCase(s,idx+1);
    }
}
