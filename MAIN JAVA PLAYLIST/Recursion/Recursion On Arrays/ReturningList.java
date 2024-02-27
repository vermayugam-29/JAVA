import java.util.ArrayList;
import java.util.List;

public class ReturningList {
    public static void main(String[] args) {
        int[] arr = {1,2,6,8,7,9,6,54,6};
        int target = 6;

        List<Integer> list = new ArrayList<>();
//        list = fun(arr,target,0,list);
        //or we can write it as : -
//        List<Integer> ans = fun(arr, target, 0, new ArrayList<Integer>());
        List<Integer> ans = fun(arr, target, 0,list);

        System.out.println(list);
        System.out.println(ans);
    }
    static List<Integer> fun(int[] arr,int target,int idx,List<Integer> list){
        if(idx >= arr.length){
            return list;
        }
        if(arr[idx]==target){
            list.add(idx);
        }

        return fun(arr,target,idx+1,list);
    }
}
