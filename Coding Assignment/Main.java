import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int max = 0;
        for(int i : arr){
            max = Math.max(max,i);
        }
        int ans = binary(arr,10,1,max*10);
        System.out.println(ans);
    }
    private static int binary(int[] arr,int target,int s,int e){
        while (s <= e) {
            int m = s + (e-s)/2;
            if(isPossible(arr,target,m)){
                e = m -1;
            } else {
                s = m + 1;
            }
        }
        return s;
    }
    private static boolean isPossible(int[] arr,int target,int mid){
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            int prev = arr[i];
            while(sum+prev <= mid){
                sum += prev;
                prev += arr[i];
                cnt++;
                if(cnt == target) return true;
            }
//            System.out.println(sum);
        }
        return false;
    }
}
