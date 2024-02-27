import java.util.ArrayList;
import java.util.List;

public class IterativeSubset {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
//        for (List<Integer> list : ans){
//            System.out.println(list);
//        }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for(int i=0;i<arr.length;i++){
            int n = outerList.size();
            for(int j=0;j<n;j++){
                List<Integer> internalList = new ArrayList<>(outerList.get(j));
                internalList.add(arr[i]);
                //adding internal list to outer list
                outerList.add(internalList);
            }
        }
        return outerList;
    }
}
