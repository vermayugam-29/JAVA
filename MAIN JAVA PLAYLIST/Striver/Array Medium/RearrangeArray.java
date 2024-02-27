import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = sc.nextInt();
        }
        // withList(arr, n);
        TwoPointer(arr, n);
        
    }
    // with TWO POINTER -----------------------------------------------------------------------------------
    public static void TwoPointer(int[] arr,int n){
        int i =0; //index for positives because acc to ques every positive index will come  on even index
        int j =1; //index for negative elements
        int[] ans = new int[n];
        for (int j2 = 0; j2 < arr.length; j2++) {
            if(arr[j2]>0){
                ans[i] = arr[j2];
                i = i+2; 
            }
            else {
                ans[j] = arr[j2];
                j+=2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    // With Array List-----------------------------------------------------------------------------------------
    public static void withList(int[] arr,int n){
        List<Integer> listPve = new ArrayList<>();
        List<Integer> listNve = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                listPve.add(arr[i]);
            }
            else{
                listNve.add(arr[i]);
            }
        }
        for (int i = 0; i < n/2; i++) {
            list.add(listPve.get(i));
            list.add(listNve.get(i));
        }
        System.out.println(list);
    }
}
