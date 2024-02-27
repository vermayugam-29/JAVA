import java.util.Scanner;

public class difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int product = 1;
        int sum = 0;

        while(n>0){
            int r = n%10;
            product = product*r;
            sum = sum + r;
            n = n/10;
        }
        System.out.print(product-sum);
        // return product-sum;
    }
}
