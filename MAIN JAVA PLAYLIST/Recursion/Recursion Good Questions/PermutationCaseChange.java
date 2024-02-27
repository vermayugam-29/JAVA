import java.util.*;

public class PermutationCaseChange {
    public static void main(String[] args) {
        String s = "a1b2";
        change(s,"");
        System.out.println(list);
    }
    static List<String> list = new ArrayList<>();
    static void change(String ip,String op){
        if(ip.isEmpty()){
            list.add(op);
            return;
        }

        char ch = ip.charAt(0);

        if(Character.isDigit(ch)){
            change(ip.substring(1),op + ch);
        }

        else{
            change(ip.substring(1),op + Character.toUpperCase(ch));
            change(ip.substring(1),op + Character.toLowerCase(ch));
        }
    }
}
