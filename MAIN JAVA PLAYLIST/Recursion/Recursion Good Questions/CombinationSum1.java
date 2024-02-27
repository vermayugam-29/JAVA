import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int target = 8;

        List<Integer> list = new ArrayList<>();
        solve(0,arr,target,list);
    }
    static void solve(int i,int[] arr,int target,List<Integer> list){
        if(i==arr.length){
            if(target == 0) System.out.println(new ArrayList<>(list));
            return;
        }


        if(target >= arr[i]) {
            list.add(arr[i]);
            solve(i,arr,target-arr[i],list);
            list.removeLast();
        }

        solve(i+1,arr,target,list);
    }
}
