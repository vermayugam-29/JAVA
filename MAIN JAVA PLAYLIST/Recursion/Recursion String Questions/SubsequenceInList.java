import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubsequenceInList {
    public static void main(String[] args) {
        String up = "abc";
        ArrayList<String> list = new ArrayList<>();
        subseq("",up,list);
        System.out.println(list);
        System.out.println(subseq2("",up));
    }
    //approach 1 :- passing a list in argument
    static void subseq(String p, String up, ArrayList<String> list){
        if(up.isEmpty()){
            if(!p.isEmpty()) list.add(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch,up.substring(1),list);
        subseq(p,up.substring(1),list);
    }
    //approach 2:- without passing a list in argument

    static ArrayList<String> subseq2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(!p.isEmpty()) list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseq2(p+ch,up.substring(1));
        ArrayList<String> right = subseq2(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
