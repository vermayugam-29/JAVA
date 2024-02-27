import java.util.*;

public class RotateAndReverse {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int  k = sc.nextInt();
        int j = 0;
        ArrayList<Integer> resultant = new ArrayList<>();
        while(j<n){
            int a = 0;
            ArrayList<Integer> rev = new ArrayList<>();
            while(a < k && j < n){
                rev.add(list.get(j));
                a++;
                j++;
            }
            Collections.reverse(rev);
            resultant.addAll(rev);
        }
        System.out.println(resultant);

    }
}
