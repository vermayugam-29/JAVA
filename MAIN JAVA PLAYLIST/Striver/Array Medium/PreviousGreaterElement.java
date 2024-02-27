import java.util.*;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> ans = PreviousGreater(arr,n);
        System.out.println(ans);
    }
    public static List<Integer> PreviousGreater(int[] arr,int n){
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        list.add(arr[0]);
        ans.add(-1);

        for (int i = 1; i < arr.length; i++) {
            while(list.size()!=0 && list.get(list.size()-1)<=arr[i]){
                list.remove(list.size()-1);
            }
            if(list.size() == 0){
                ans.add(-1);
            }
            else{
                ans.add(list.get(list.size()-1));
            }
            list.add(arr[i]);
        }
        return ans;
    }
}