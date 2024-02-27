import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = singleNumber(arr);

        System.out.println(ans);
    }
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int e: nums) {
            if(map.containsKey(e)){
                map.put(e, map.get(e) + 1);
            }
            else{
                map.put(e, 1);
            }    
        }

        for(var e : map.entrySet()){
            if(e.getValue() == 1){
                return  e.getKey();
            }
        }
        // for(int k : map.keySet()){
        //     if(map.get(k) == 1){
        //         return k;
        //     }
        // }

        return -1;
    }
}
