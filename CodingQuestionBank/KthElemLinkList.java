import java.util.*;

public class KthElemLinkList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        list.add(n);
        while(n!=-1){
            n = sc.nextInt();
            list.add(n);
        }
        int k = sc.nextInt();
        System.out.println(list.get(list.size()-1-k));

    }
}
