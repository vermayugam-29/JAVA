import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        // int[] arr2 = new int[2];
        // for (int i = 0; i < arr.length-1; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[i]+arr[j] == target){
        //             arr2[0]= i;
        //             arr2[1]=j;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr2));

        int[] ans = UsingMap(arr,  target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] UsingMap(int[] arr,int target){
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(target-arr[i])){
                map.put(arr[i],i);

            }
            else{
                ans[0] = map.get(target-arr[i]);
                ans[1] = i;
            }
        }
        return ans;
    }
}