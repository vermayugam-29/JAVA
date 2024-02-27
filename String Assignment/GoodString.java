import java.util.*;
public class GoodString {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        ArrayList<String> list = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String a = s.substring(i,j);
                if(isGood(a)){
                    list.add(a);
                }
            }
        }

        if(list.size() == 0){
            System.out.print("");
        }
        else{
            int max = -1;
            String ans = "";

            for(int i=0;i<list.size();i++){
                String b = list.get(i);
                if(max < b.length()){
                    max = b.length();
                    ans = b;
                }
            }
            System.out.print(ans);
        }
    }
    public static boolean isGood(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
