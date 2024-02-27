import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // System.out.println(fibo(n));
        System.out.println(fib(n));
    }
    //derivation method
    public static int fib(int n) {
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
    //original method---------------------------------------------------------------------------------
    static int fibo(int n){
        if(n < 2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
    //my method---------------------------------------------------------------------------------------
    static void fibonacci(int n,int a,int b,int number,int loop){
        if(loop == n){
            System.out.println(number);
            return;
        }
        number = a + b;
        a = b;//take it as prev elemnt than current prev
        b = number;//take it as prev element 
        loop++;
        fibonacci(n, a, b, number, loop);
    }
}
