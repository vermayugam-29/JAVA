import java.util.*;
public class HighestFrequency {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int max = arr[0];
        int frq = 0;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue() >= frq){
                frq = e.getValue();
                max = e.getKey();
            }
        }
        System.out.print(max);
    }
}