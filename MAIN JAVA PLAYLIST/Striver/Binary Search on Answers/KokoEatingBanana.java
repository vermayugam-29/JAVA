import java.util.Scanner;

public class KokoEatingBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int h = sc.nextInt();

        int max = MaxElement(arr);
        int ans = Binary(max, h, arr);

        System.out.println(ans);
    }
    public static int Binary(int max,int target,int[] arr){ //target is no. of hours i.e h
        int start = 1;
        int end = max;

        while(start <= end){
            int mid = start + (end-start)/2;
            int Totalhrs = TimeTaken(mid, arr);
            if(Totalhrs <= target){
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
        }
        return start;
    }
    //finding total hrs taken if eaten i banana in (mid) time
    public static int TimeTaken(int mid,int[] arr){
        int ans = 0;//ans = total hrs per banana
        for (int i = 0; i < arr.length; i++) {
            ans += Math.ceil((double)(arr[i]) / (double)(mid));
        }
        return ans;
    }
    //finding max element of array
    public static int MaxElement(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
