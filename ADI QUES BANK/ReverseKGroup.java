import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseKGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(data);
        while(data != -1){
            data = sc.nextInt();
            if(data!= -1) list.add(data);
        }
        int k = sc.nextInt();
        int size = list.size();

        for(int i=0;i<list.size();i+=k){
            int start = i;
            int end = Math.min((i+k-1),size-1);

            while(start < end){
                swap(list,start,end);
                start++;
                end--;
            }
        }
        System.out.println(list);
    }
    static void swap(List<Integer> list,int s,int e){
        int temp = list.get(s);
        list.set(s,list.get(e));
        list.set(e,temp);
    }
}
