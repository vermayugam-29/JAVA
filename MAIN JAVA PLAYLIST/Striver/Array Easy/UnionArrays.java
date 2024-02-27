import java.util.*;

public class UnionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr= new int[n];
        int[] arr2= new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] =sc.nextInt();
        }

        //tree set method------------------------------------------------------------------
        TreeSet<Integer> list = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);
        }
        // System.out.println(list);

        //array list method------------------------------------------------------------------------
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            ans.add(arr2[i]);
        }
        Collections.sort(ans);
        for (int i = 1; i < ans.size(); i++) {
            if(ans.get(i-1)==ans.get(i)){
                ans.remove(i);
                i--;
            }
            else{
                continue;
            }
        }
        System.out.print(ans);

        //Hashset method-----------------------------------------
        HashSet<Integer> result = new HashSet<>();
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            result.add(arr2[i]);
        }
        // while(a<arr.length && b<arr2.length){
        //     if(arr[a]<arr2[b]){
        //         result.add(arr[a]);
        //         a++;
        //     }
        //     else{
        //         result.add(arr2[b]);
        //         b++;
        //     }
        // }
        // while(a<arr.length){
        //     result.add(arr[a]);
        //     a++;
        // }
        // while(b<arr2.length){
        //     result.add(arr2[b]);
        //     b++;
        // }
        ArrayList<Integer> anss = new ArrayList<>(result);
        // System.out.println(anss);
    }
}
