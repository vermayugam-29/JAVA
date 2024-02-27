import java.util.PriorityQueue;
import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = str.length();
        int num = Integer.parseInt(str);

        int sum = 0;
        for(int i=0;i<str.length();i++){
            int a = str.charAt(i) - '0';
            sum += (int)Math.pow((double)a,n);
        }
        boolean flag = (sum == num);
        System.out.println(flag);
    }
}
