import java.util.*;
public class StringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  str = sc.nextLine();
        int  ans = -1;
        Boolean check = false;
        char target = sc.next().trim().charAt(0);
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                check = true;
            }
        }
        // System.out.println(check);
        System.out.println(Arrays.toString(str.toCharArray()));
    }
}
