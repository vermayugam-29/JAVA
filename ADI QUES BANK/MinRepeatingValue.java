import java.util.*;

public class MinRepeatingValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Map<Integer,Integer> map = new TreeMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > 1){
                pq.add(e.getValue());
            }
        }
        int num = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(pq.peek() == e.getValue()){
                num = e.getKey();
                break;
            }
        }
        System.out.println(num);
    }
}
