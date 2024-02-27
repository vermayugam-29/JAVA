import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // String str = sc.nextLine();
        // String str2[] = new String[str.length()];
        // for (int i = 0; i < str2.length; i++) {
        //      str2[i] = str.toCharArray()
        // }

        //printing alphabets ---------------------------------------------------------------------------------
        String a = "";
        char ch = 'a'; 
        for (int i = 0; i < 52; i++) {
            ch = (char)('A' + i);
            a = a +" " + ch;
        }
        System.out.print(a);
    }
}