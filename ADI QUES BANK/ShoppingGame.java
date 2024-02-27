import java.util.*;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int test = sc.nextInt();
        while(test-- > 0){
            int totalMoney = sc.nextInt();
            int k = sc.nextInt();

            int count = 0;

            for (int j : arr) {
                if (totalMoney % j == 0) count++;
            }
            String ans = count>=k ? "Yes" : "NO";
            System.out.println(ans);
        }
    }
}
