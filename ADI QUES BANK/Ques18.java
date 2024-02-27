import java.util.Scanner;

public class Ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(isUgly(n));
    }
    static boolean isUgly(int n){
        //base case
        if(n == 1){
            return true;
        }
        //edge case
        if(n == 0){
            return false;
        }

        if(n%2 == 0) return isUgly(n/2);
        if(n%3 == 0) return isUgly(n/3);
        if(n%5 == 0) return isUgly(n/5);

        //if none passes just return false;
        return false;
    }
}
