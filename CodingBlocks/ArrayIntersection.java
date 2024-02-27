import java.util.*;
public class ArrayIntersection {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // int m = sc.nextInt();
        int[] arr2 = new int[n];
        for(int i = 0;i<n;i++){
            arr2[i] = sc.nextInt();
        }

        System.out.print(Arrays.toString(intersection(arr,arr2,n)));
    }
    static int[] intersection(int[] arr,int[] arr2,int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int a = arr2[i];
            if(map.get(a) != null && map.get(a)>0){
                list.add(a);
                map.put(a,map.get(a)-1);
            }
        }
        Collections.sort(list);
        int[] ans = new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

}
