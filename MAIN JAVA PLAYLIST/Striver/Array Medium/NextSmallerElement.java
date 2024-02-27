import java.util.*;

public class NextSmallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> ans = NextSmaller(arr, n);
        System.out.println(ans);
    }
    public static List< Integer > NextSmaller(int[] arr,int n){
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        list.add(arr[n-1]);
        ans.add(-1);

        for (int i=n-2 ; i >=0 ; i--) {
            while(list.size()!=0  && list.get(list.size()-1)>=arr[i]){
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
        Collections.reverse(ans);
        return ans;
    }
}
