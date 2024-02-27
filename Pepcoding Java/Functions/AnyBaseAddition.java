import java.util.Scanner;

public class AnyBaseAddition {

    public static int BaseAdd(int b , int n1 , int n2){
        int rv = 0;
        int c = 0; // c= carry
        int p = 1;
        while (n1>0 || n2>0 || c>0) {
            int rem1 = n1%10;
            int rem2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;

            int sum = rem1 + rem2 + c;
            c = sum/b;
            sum = sum%b;
            rv += sum*p;
            p = p * 10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(BaseAdd(b, n1, n2));
        // System.out.println(6/8);
    }
}
