import java.util.*;

public class EvenFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0;i < n;i++) {
            if(list.get(i) % 2 ==0){
                even.add(list.get(i));
            }
            else{
                odd.add(list.get(i));
            }
        }
        // Collections.sort(even);
        // Collections.sort(odd);
        list.removeAll(list);   
        list.addAll(even);
        list.addAll(odd);
        /*or we can do
         even.addAll(odd);
         System.out.print(even);
         */
        System.out.println(list);
    }
}
