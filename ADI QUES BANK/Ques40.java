import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> ans = primeFactors(n,2);
        System.out.println(ans);

    }
    static List<Integer> list = new ArrayList<>();

    static List<Integer> primeFactors(int n,int divisor){
        if(n == 1){
            return list;
        }

        if(n%divisor == 0){
            list.add(divisor);
            return primeFactors(n/divisor,divisor);
        }
        return primeFactors(n,divisor+1);
    }
}
