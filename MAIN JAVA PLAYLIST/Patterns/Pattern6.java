import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printing(n);
    }
    static void printing(int n){
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
