import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0; // 1st fibo number
        int b = 1; // 2nd fibo number
        int c = 1; // 0+1=c new fibo output number

        for (int i = 2; i <=n; i++) {  // i start from 2 because already have 0 and 1
            c = a + b; //c= 1st no + 2nd no
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
