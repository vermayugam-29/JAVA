import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  n = sc.nextInt();
        System.out.println(primefactorization(n));
    }
    static boolean primefactorization(int n){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                list.add(i);

            }
        }

        System.out.println(list);
        for(int i=0;i<list.size();i++){
            int x = list.get(i);
            if(x!=2 && x!=3 && x!=5) return false;
        }
        return true;
    }
}
