import java.util.Scanner;

public class SunButAlternateSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;//sc.nextInt();
        //meaning : 1 -2 +3 -4 +5 = 3
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n == 0) return n;
        if(n%2 == 0){
            return n*(-1) + sum(n-1);
        }
        return n + sum(n-1);
    }
}
