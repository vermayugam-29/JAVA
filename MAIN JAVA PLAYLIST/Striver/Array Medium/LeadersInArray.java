import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = sc.nextInt();
        }
        // superiorElements(arr);
        List<Integer> ans = SuperiorConsecutiveElement(arr, n);
        System.out.println(ans);

    }
    //Sparsh method-----------------------------------------------------------------------------------
    public  static List<Integer> SuperiorConsecutiveElement(int[] arr,int n){
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        list.add(arr[arr.length-1]);
        ans.add(arr[arr.length-1]);

        for (int i = arr.length-2; i >=0 ; i--) {
            if(list.get(list.size()-1)<arr[i]){
                ans.add(arr[i]);
                list.add(arr[i]);
            }
        }
        return ans;
    }

    //my first brute force method=------------------------------------------------------------------
     public static void superiorElements(int []a) {
        int n = a.length;
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i =0;i<a.length-1;i++){
            count = 0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    count++;
                }
            }
            if(count==(n-i-1)) list.add(a[i]);
        }
        list.add(a[a.length-1]);
        Collections.sort(list);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i)==list.get(i-1)){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
