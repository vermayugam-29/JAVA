import java.util.*;

public class TopKFrequentEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Arrays.toString(topKFrequent(arr, k)));
        
    }
    public static int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list,Collections.reverseOrder());

        ArrayList<Integer> list2 = new ArrayList<>(list.subList(0, k));

        int[] ans = new int[list2.size()];
        int j = 0;
        for (var entry : map.entrySet()) {
            // if(j == ans.length) break;
            if (list2.contains(entry.getValue())) {
                ans[j++] = entry.getKey();
            }
        }

        return ans;
    }
}
