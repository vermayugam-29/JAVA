import java.util.*;

public class GenerateSubarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        solve(arr,0,0);
        for (List<Integer> list : ans){
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();;
        }
    }
    static List<List<Integer>> ans = new ArrayList();
    private static void solve(int[] arr,int start,int end){
        if(end >= arr.length) {
            return;
        } if(start > end){
            solve(arr,0,end+1);
            return;
        }

        List<Integer> l = new ArrayList();
        for (int i = start; i <= end; i++) {
            l.add(arr[i]);
        }
        ans.add(l);
        solve(arr,start+1,end);
    }
}
