import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class DataStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            pq.add(value);
            System.out.print(pq.peek()+ " ");
        }
    }
}
