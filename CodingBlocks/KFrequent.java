import java.util.*;
public class KFrequent {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        ArrayList<Integer> answer = frequency(arr,k);

        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }
    public static ArrayList<Integer> frequency(int[] arr,int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());

        ArrayList<Integer> result = new ArrayList<>(list.subList(0,k));

        ArrayList<Integer> list3 = new ArrayList<>();

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(result.contains(e.getValue())){
                list3.add(e.getKey());
            }
        }

        return list3;
    }
}