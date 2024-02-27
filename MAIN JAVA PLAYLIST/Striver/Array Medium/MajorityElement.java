import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = sc.nextInt();
        }
        System.out.println(Majority(arr, n));
    }
    //Morrey's Voting Algorithm-------------------------------------------------------------------------------
    public static int Majority(int[] arr,int n){
        int max = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max) count++;
            else if(count == 0) {
                max = arr[i];
                i--;
            }
            else count--;
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max == arr[i]) count++;
        }
        if(count > n/2) return max;

        return -1;
    }
}
