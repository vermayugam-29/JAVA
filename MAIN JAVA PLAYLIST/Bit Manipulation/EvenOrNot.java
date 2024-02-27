import java.util.*;
public class EvenOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isEven(n));
    }
    static boolean isEven(int n){
        return (n & 1) != 1;
    }
}