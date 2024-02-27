import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        solve(arr,0,target,new ArrayList<>());
    }
    static void solve(int[] arr, int idx, int target, List<Integer> list){
        if(target == 0){
            System.out.print(new ArrayList<>(list) + " ");
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(i > idx && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;

            list.add(arr[i]);
            solve(arr,i+1,target-arr[i],list);
            list.removeLast();
        }
    }
}
