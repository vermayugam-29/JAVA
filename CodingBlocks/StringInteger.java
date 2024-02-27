import java.util.*;
//ABc CDeF GHi
public class StringInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Exam(s));
    }
    public static String Exam(String s){
        s = s.replaceAll(" +"," ");
        s= s.trim();
        String ans ="";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 65 & s.charAt(i) <= 90){
                int a = s.charAt(i) - 'A' + 1;
                sum += a;
            }
            else if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                int b = (s.charAt(i) - 'a' + 1)*-1;
                sum += b;
            }
            else if(s.charAt(i) == ' '){
                if(sum > 9){
                    sum = 9;
                }
                if(sum <0){
                    sum = 0;
                }
                ans += sum;
                sum = 0;
            }
        }
        if(sum > 9){
            sum = 9;
        }

        if(sum < 0){
            sum = 0;
        }
        ans += sum;


        return ans;
    }
}
