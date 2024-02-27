import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int digits = (int) (Math.log10(n)) + 1;
        System.out.println(isPalindrome(n,rev(n,digits)));
    }
    static int rev(int n,int pow){
        if(n <= 0){
            return 0;
        }

        return (n%10)*(int)(Math.pow(10,pow-1)) + rev(n/10,pow-1);
    }
    static boolean isPalindrome(int n,int rev){
        return rev == n;
    }
}
