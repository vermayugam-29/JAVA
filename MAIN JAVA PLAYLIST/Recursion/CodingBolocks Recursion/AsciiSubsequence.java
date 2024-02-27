//QUES:-Take as input str, a string. We are concerned with all the possible ascii-subsequences
// of str. E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”
//
//a. Write a recursive function which returns the count of ascii-subsequences for a given string.
// Print the value returned.
//
//b. Write a recursive function which prints all possible ascii-subsequences for a given
// string (void is the return type for function).
import java.util.*;
public class AsciiSubsequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        subseq("",s);
        System.out.println();
        System.out.println(count);
    }
    static int count = 0;
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+ " ");
            count++;
            return;
        }

        char ch = up.charAt(0);
        //ignore ch
        subseq(p,up.substring(1));
        //take char
        subseq(p + ch,up.substring(1));
        //take ascii code
        subseq(p + (ch - 0),up.substring(1));

    }
}
