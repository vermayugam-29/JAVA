import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        System.out.println(isPrime(n));
        printPrime(n);
    }
    static void printPrime(int n){
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i +" ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
