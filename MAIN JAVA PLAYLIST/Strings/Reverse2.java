import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        StringBuilder sb = new StringBuilder(str1);
        System.out.println(sb.reverse());
    }
}
