import java.util.*;

public class ChInsertinStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == n || i == k) {
                sb.append("*");
            }
            sb.append(str.charAt(i));
        }
        System.out.print(sb);

    }
}