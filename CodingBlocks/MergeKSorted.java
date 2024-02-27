import java.util.*;

public class MergeKSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        while(test_case > 0){
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                list.add(arr[i]);
            }
            test_case--;
        }
        Collections.sort(list);

        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
            System.out.print(ans[i] + " ");
        }
    }
}