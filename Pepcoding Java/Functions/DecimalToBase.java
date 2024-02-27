import java.util.*;

public class DecimalToBase {

    public static int baseChange(int n , int b){
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
        int b = sc.nextInt();
        System.out.println(baseChange(n, b));
    }
}
