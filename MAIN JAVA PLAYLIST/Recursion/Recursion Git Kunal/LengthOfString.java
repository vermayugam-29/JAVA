import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "YUGAM";//sc.next();
        System.out.println(s.substring(3));
        System.out.println(length(s));
    }
    static int length(String str){
        if (str.equals(""))
            return 0;
        else
            return length(str.substring(1)) + 1;
    }
}
