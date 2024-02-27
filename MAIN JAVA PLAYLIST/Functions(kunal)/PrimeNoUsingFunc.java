import java.util.Scanner;

public class PrimeNoUsingFunc {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = primrORnot(n);
        System.out.println(ans);
    }

    static boolean primrORnot(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while (c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        
        return true; 
    }
}
