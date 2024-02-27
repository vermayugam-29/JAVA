import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        sort(list);
        System.out.println(list);
    }
    static void sort(List<Integer> list){
        if(list.isEmpty() || list.size() == 1) return;

        int temp = list.getLast();
        list.removeLast();
        sort(list);
        insert(list,temp);
    }
    static void insert(List<Integer> list,int temp){
        if(list.isEmpty() || list.getLast() <= temp){
            list.add(temp);
            return;
        }

        int val = list.getLast();
        list.removeLast();
        insert(list,temp);
        list.add(val);
    }
}
