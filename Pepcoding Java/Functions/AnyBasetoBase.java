import java.util.Scanner;

public class AnyBasetoBase {

    public static  int AnyBaseToBase(int n , int b1 , int b2){
        int dec = AnyBasetoDecimal(n, b1);
        int dn = decimalToAnyBase(dec, b2);
        return dn;
    }
    public static int AnyBasetoDecimal(int n , int b){
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
    public static int decimalToAnyBase(int n , int b){
        int rv = 0;  // rv = return value
        int p = 1;
        while  (n > 0){
            int rem = n % b;
            n = n / b;
            rv = rv + (rem*p);
            p = p *10;
        }
        return rv;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println(AnyBaseToBase(n, b1, b2));
    }
}
