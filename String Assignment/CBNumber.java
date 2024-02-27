import java.util.*;
public class CBNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String a = s.substring(i,j);
                if(isCBnumber(a)){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static boolean isCBnumber(String s){
        for(int i=0;i<s.length();i++){
            int ch = Character.getNumericValue(s.charAt(i));
            if(s.charAt(i) == '0' && s.charAt(i) == '1'){
                return false;
            }
            if(ch%2==0 || ch%3==0 ||ch%5==0 || ch%7==0 ||ch%11==0 || ch%13==0 ||
                    ch%17==0 || ch%19==0 ||ch%23==0 || ch%29==0 ){
                return false;
            }
        }
        return true;
    }
}