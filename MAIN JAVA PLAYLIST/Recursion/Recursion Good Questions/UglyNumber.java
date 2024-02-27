import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();///check if this number is ugly or not

        System.out.println(isUgly(n));
    }
    static boolean isUgly(int n){
        //edge case
        if(n == 0) return false;
        //base case
        if(n == 1) return true;

        //conditions for ugly number
        if(n%2 == 0) return isUgly(n/2);
        if(n%3 == 0) return isUgly(n/3);
        if(n%5 == 0) return isUgly(n/5);

        //if neither of conditions follow then that means number is not ugly
        return false;
    }
}
