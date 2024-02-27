import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//size of the array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = solve(arr,k,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] solve(int[] arr,int k,int n){
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[n-k+1];

        int i = 0;
        int j = 0;

        int x = 0;
        //sliding window  technique
        while(j < arr.length){
            if(arr[j] < 0){
                list.add(arr[j]);
            }
            if(j-i+1 < k){
                j++;
            }
            //if window is reached slide the window
            else if(j-i+1 == k){
                if(list.isEmpty()) ans[x] = 0; //if no negative element found
                else if(!list.isEmpty()) {
                    ans[x] = list.get(0);
                    if(!list.isEmpty() && list.get(0) == arr[i]) {
                        list.remove(0);
                    }
                }
                i++;
                j++;
                x++;
            }
        }
        return ans;
    }
}
