import java.util.Scanner;

public class LongPressedName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String typed = sc.next(); 

        boolean ans = isLongPressedName(name, typed);
        System.out.println(ans);
    }
    public static boolean isLongPressedName(String a,String b){
        int n = a.length();
        int m = b.length();

        if(n > m){
            return false;
        }

        int i = 0;
        int j = 0;

        while(i < n && j < m){
            if(a.charAt(i) == b.charAt(j)){
                i++;
                j++;
            }
            else if(i > 0 && a.charAt(i-1) == b.charAt(j)){
                j++;
            } 
            else{
                return false;
            }
        }
        //Case when i  will reach its length but j has still some characters to check
        while(j < m){
            if(a.charAt(i-1)!= b.charAt(j)){
                return false;
            }
            j++;
        }

        //also case when j will rech m and  i still have some chars 
        //eg :- name ="aabbcc" typed = "aaabbb"
        //if i<name.length() then return false  otherwise true
        return i < n ? false : true;
    }
}
