//Ques:-
//A string s is said to be Beautiful String if s can be palindrome after deleting at most
// one character from it.
//Given a string s , Print True if s is a beautiful string .

import java.util.Scanner;

public class BeautifulString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcdefgfedcba";//sc.next();
        System.out.println(solve("",s));
    }
    static boolean solve(String p,String up){
        for(int idx = 0;idx<up.length()-1;idx++){
            String first = up.substring(0,idx);
            String second = up.substring(idx+1);
            if(isPalin(first+second)) return true;
        }
        return false;
    }
    static boolean isPalin(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
