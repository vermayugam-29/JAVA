import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<=1){
            System.out.print("Neither prime nor composite");
            
        }
        int c = 2;
        while (c*c <= n){
            if(n%c == 0){
                System.out.print("Not Prime");
                break;
            }
            c = c +1;
            
        }
        // int c = 2;
        if(c*c > n){
            System.out.println("Prime");
        }
    }
}
