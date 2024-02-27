import java.sql.Array;
import java.util.*;

public class RemoveStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        String check = sc.next();
        NewMethod(str, check);
    }
    public static void NewMethod(String[] str,String a){
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if(str[i].charAt(0) > a.charAt(0)){
                list.add(str[i]);
            }
        }
        System.out.println(list);
    }
}
