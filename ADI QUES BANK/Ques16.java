import java.util.*;

public class Ques16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        print(str);
    }
    static void print(String s){
        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String a = s.substring(i,j);
                if(a.length()>=3 && isPalidrome(a)){
                    list.add(a+" "+i+"-"+(j-1));
                }
            }
        }
        if(list.isEmpty()){
            System.out.println("No Palindrome string found");
        }
        else{
            Collections.reverse(list);
            for(String e : list){
                System.out.println(e);
            }
        }
    }
    static boolean isPalidrome(String a){
        int i = 0;
        int j = a.length()-1;
        while(i < j){
            if(a.charAt(i) != a.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
}
