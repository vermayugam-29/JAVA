//Question 3 solution without using kmp

import java.util.ArrayList;
import java.util.Scanner;

public class SubstringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Texts = sc.next();
        String Pattern = sc.next();

        BruteForce(Texts,Pattern);
    }
    public static void BruteForce(String s,String a){
        //making an ArrayList which will store index of pattern occuring in string text
        ArrayList<Integer> list = new ArrayList<>();
        //generating all substrings of the string Text
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1;j<= s.length();j++){
                String str = s.substring(i,j);
                if(str.equals(a)){
                    list.add(i);
                }
            }
        }
        if(list.size() == 0){
            System.out.println("Pattern Not Found");
        }
        else{
            System.out.print("Pattern found at index:");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
