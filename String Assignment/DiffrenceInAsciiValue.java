import java.util.*;
public class DiffrenceInAsciiValue {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        ArrayList<String> list = new ArrayList<>();
        list.add(s.charAt(0)+"");
        for(int i=1;i<s.length();i++){
            char ch = s.charAt(i);
            int x = ch - s.charAt(i-1);
            list.add(String.valueOf(x));
            list.add(ch+"");
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
    }
}
