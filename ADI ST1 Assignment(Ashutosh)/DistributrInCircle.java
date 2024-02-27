import java.util.Scanner;

public class DistributrInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //number of items
        int b = sc.nextInt(); //size of circle
        int c = sc.nextInt(); //starting position

        int ans = (a + c - 1)% b;
        if(ans == 0){
            ans = b;
        }
        System.out.println(ans);
    }
}
