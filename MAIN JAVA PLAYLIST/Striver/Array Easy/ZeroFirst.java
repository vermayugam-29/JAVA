import java.util.ArrayList;
import java.util.Scanner;

public class ZeroFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> ZeroF = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0;i < n;i++) {
            if(list.get(i) == 0){
                ZeroF.add(list.get(i));
            }
            else{
                odd.add(list.get(i));
            }
        }
        // list.removeAll(list);
        // list.addAll(odd);  
        // list.addAll(ZeroF);
        odd.addAll(ZeroF);
        
        System.out.println(odd);
    }
}