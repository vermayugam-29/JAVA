import java.util.Scanner;

public class MessageProcessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        a = a.replaceAll(" +", "");
        String ans = "" + Character.toUpperCase(a.charAt(0));
        ans = ans +a.substring(1,a.length());
        System.out.println(ans.trim());
    }
}
