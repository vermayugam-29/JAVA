import java.util.*;
//https://leetcode.com/problems/sliding-window-maximum/description/
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maximum(arr,n,k);

    }
    private static void maximum(int[] arr,int n,int k){
        List<Integer> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;

        //arr : - 1 2 3 1 4 5 2 3 6
        //arr : - 20 10 5 8 6
        while(j < arr.length){
            //calculations
            if(list.isEmpty()){
                list.add(arr[j]);
            }
            else{
                while(!list.isEmpty() && list.get(list.size()-1) < arr[j]){
                    list.remove(list.size()-1);
                }
                list.add(arr[j]);
            }

            //if  window doesn't reach k
            if(j-i+1 < k){
                j++;
            }

            //if window size reached k
            else if(j-i+1 == k){
                //deriving answer from calculations
                ans.add(list.get(0));

                if(arr[i] == list.get(0)){
                    list.remove(0);
                }
                //sliding the window
                i++;
                j++;
            }
        }
        System.out.println(list);
        System.out.println(ans);
    }
}
