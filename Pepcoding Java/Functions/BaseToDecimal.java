import java.util.Scanner;

public class BaseToDecimal {

    public static int DecimalConvert(int n , int b){
        int rv = 0;
        int p = 1;
        while(n>0){
            int rem = n % 10;
            n = n / 10;
            rv += rem*p;
            p = p * b;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(DecimalConvert(n, b));
    }
}
