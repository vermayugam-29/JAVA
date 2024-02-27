import java.util.*;

public class PrintSubsets {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> subsets = new ArrayList<>();
        subset(arr, 0, new ArrayList<>(), subsets);
        System.out.println(subsets);
    }
    public static void subset(int[] arr, int idx, List<Integer> internalList, List<List<Integer>> outerList) {
        if (idx == arr.length) {
            outerList.add(new ArrayList<>(internalList));
            return;
        }


        internalList.add(arr[idx]);
        subset(arr, idx+1, internalList, outerList);
        internalList.removeLast();
        subset(arr, idx+1, internalList, outerList);

    }
}
