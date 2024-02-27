import java.util.*;
public class IntersectionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(intersection(arr1, arr2));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = Map(nums1);
        //hash set method--------------------------------------------------------------------------------------
        // HashSet<Integer> set = new HashSet<>();

        // for(int i=0;i<nums2.length;i++){
        //     if(map.containsKey(nums2[i])){
        //         set.add(nums2[i]);
        //     }
        // }

        // int[] ans = new int[set.size()];
        // Iterator<Integer> iterator = set.iterator();//set is name of hash set
        // int i = 0;
        // while (iterator.hasNext()) {
        //     ans[i] = iterator.next();
        //     i++;
        // }
        // return ans;

        //using arraylsit-----------------------------------------------------------------------------------------
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            if(map.get(nums2[i]) != null && map.get(nums2[i]) > 0){
                list.add(nums2[i]);
                map.put(nums2[i],0);
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0 ; i <list.size() ;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
    public static HashMap<Integer,Integer> Map(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        return map;
    }
}
