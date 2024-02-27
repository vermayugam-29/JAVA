import java.util.Arrays;
import java.util.Scanner;

public class  ReverseWords {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int  n = str.length;
        for(int i=0;i<str.length/2;i++){
            Swap(str,i,n-1-i);
        }
        s = String.join(" ", str);
        System.out.println(s.trim().replaceAll(" +", " "));
    }
    public static void Swap(String[] str,int a,int b){
        String temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }
    public static String UsingBuilder(String str){
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        int n = str.length();

        for (int i = n-1; i >=0; i--) {
            if(str.charAt(i) != ' '){
                sb.append(str.charAt(i));
            }
            else{
                sb.reverse();
                ans += sb +" ";
                sb.setLength(0);
            }
        }
        ans += sb;
        ans = ans.replaceAll(" +", " ");
        return ans.trim();
    }
}
/*ishaan method ---------------------------------------------------
 String[] str = s.split(" ");
 String a = "";
 for(int i=str.length;i>0;i--){
    if(str[i] != ""){
        a = str[i] + " ";
    }
 }
 if(str[0] != ""){
    a+=str[0];
 }
 return a.trim();
 */