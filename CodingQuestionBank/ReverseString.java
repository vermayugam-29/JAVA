import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //------------------------type 1

        String a = sc.nextLine();
        // System.out.println(sb.reverse());

        //type 2------------------------

        String[] str = a.split(" ");

        // for (int i = 0; i < str.length; i++) {
        //     StringBuilder sb = new StringBuilder(str[i]);
        //     System.out.print(sb.reverse()+ " ");
        
        // }

        //type 3-------------------------
        // ArrayList<String> list = new ArrayList<>();
        // for (int i = 0; i < str.length; i++) {
        //     list.add(str[i]);
        // }
        // Collections.reverse(list);
        // for (int j = 0; j < str.length; j++) {
        //     System.out.print(list.get(j)+" ");
        // }

        //ishan method
        String s = "";
        int n = str.length;
        for(int i=n-1;i>0;i--){
            if(str[i] != ""){
                s += str[i] + " ";
            }
        }
        if(str[0] != ""){
            s += str[0];
        }
        System.out.println(s.trim());
    }
}
