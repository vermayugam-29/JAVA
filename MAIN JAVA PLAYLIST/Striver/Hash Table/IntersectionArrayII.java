import java.util.*;

public class IntersectionArrayII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //array1 input
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        //array 2 input
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        //ans
        System.out.println(intersect(arr1, arr2));

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = Map(nums1);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            int a = nums2[i];
            if(map.get(a) != null && map.get(a) >0){
                list.add(a);
                map.put(a,map.get(a)-1);
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
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        return map;
    }
}
