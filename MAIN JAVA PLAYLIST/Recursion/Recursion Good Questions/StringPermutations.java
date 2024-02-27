import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "abc";//sc.next();
        permute("",s);
        System.out.println(list);
    }
    static List<String> list = new ArrayList<>();
    static void permute(String p,String up){
        if(up.isEmpty()){
            list.add(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0;i <= p.length() ; i++){
            String first = p.substring(0,i);
            String second = p.substring(i);

            //recursive call
            permute(first+ch+second,up.substring(1));
        }
    }
}
