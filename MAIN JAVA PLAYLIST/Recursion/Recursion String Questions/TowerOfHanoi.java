import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 2;//sc.nextInt(); // no of disks

        int source = 1;//rod 1
        int destination = 3;//rod 3
        int helper = 2;//rod 2
        solve(source,destination,helper,n);
        System.out.println(count);
    }
        static int count = 0;
    static void solve(int source,int destination,int helper,int n){
        if(n == 1){
            System.out.println("move disk "+ n + " from rod " + source + " to rod " + destination);
            count++;
            return;
        }

        //moving n-1 disk from source to helper so current destination will be helper and helping
        //poll will be destination poll
        solve(source,helper,destination,n-1);

        System.out.println("move disk "+ n + " from rod " + source + " to rod " + destination);
        count = count +1;
        //moving n-1 disks kept in helper from helper to destination poll so source  will be
        //helper poll and destination will be destination poll and helping poll will now be source poll
        solve(helper,destination,source,n-1 );
    }
}
