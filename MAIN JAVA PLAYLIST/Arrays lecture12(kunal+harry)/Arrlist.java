import java.util.*;
import java.util.Scanner;

public class Arrlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(list.get(i));
        // }
        ;
        System.out.println(list.contains(5));
        System.out.println(list.get(3));
    }
}
