import java.util.*;
public class ReturnList2 {
    public static void main(String[] args) {
        int[] arr ={1,4,3,4};
        int target = 4;

        System.out.println(fun(arr,target,0));
    }
    static List<Integer> fun(int[] arr,int target,int idx){
        List<Integer> list = new ArrayList<>();
        if(idx >= arr.length){
            return list;
        }

        if(arr[idx] == target){
            list.add(idx);
        }

        List<Integer> ansFromBelowFunctionCalls = fun(arr,target,idx+1);

        list.addAll(ansFromBelowFunctionCalls);
        return list;
    }
}

