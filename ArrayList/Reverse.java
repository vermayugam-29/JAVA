import java.util.*;

public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());  //taking input
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}