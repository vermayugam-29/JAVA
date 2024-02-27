//QUES statement :-
//Take as input str, a string. Write a recursive function that checks if the string was generated
// using the following rules and returns a Boolean value:
//1. the string begins with an 'a'
//2. each 'a' is followed by nothing or an 'a' or "bb"
//3. each "bb" is followed by nothing or an 'a' Print the value returned.

import java.util.*;
public class ObedientString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char ch = s.charAt(0);
        if(!s.startsWith("a")) System.out.println("true");
        System.out.println(check(s));
    }
    static boolean check(String str){
        //base case;
        if(str.isEmpty()){
            return true;
        }
        //for char == a
        if(str.charAt(0) == 'a'){
            if(str.length() == 1) return true;//case when we are at last a in eg : abba
            if(str.charAt(1) == 'a'){
                return check(str.substring(1));
            }
            if(str.length() > 2 && str.substring(1,3).equals("bb")){
                return check(str.substring(2));//begin idx==2 because we still need current b
            }
            else return false;
        }
        //for char == b
        if(str.charAt(0) == 'b'){
            if(str.length() == 1) return true;//meaning we are at last of string eg:abb
            if(str.charAt(1) == 'a'){
                return check(str.substring(1));
            }
            else{
                return false;
            }
        }
        //if no condition passes  just "return false;" or "return check(str);"
        return false;
    }
}
