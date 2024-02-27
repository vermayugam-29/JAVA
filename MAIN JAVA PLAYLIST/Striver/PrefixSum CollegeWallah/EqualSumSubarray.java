import java.util.*;

public class EqualSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new  int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isTrue(arr));
        System.out.println(isPresent(arr));

    }

    //my method------------------------------------------------------------------------------------
    public static int[] PrefixArr(int[] arr){
        int[] pref = new int[arr.length];
        pref[0] = arr[0];
        for (int i = 1; i < pref.length; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }
    public static int[] SuffixArr(int[] arr){
        int[] suff = new int[arr.length];
        suff[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            suff[i] = suff[i+1] + arr[i];
        }
        return suff;
    }
    public static boolean isTrue(int[] arr){
        int[] pref = PrefixArr(arr);
        int[] suff = SuffixArr(arr);

        for (int i = 0; i < suff.length; i++) {
            if(suff[i+1] == pref[i]){
                return true;
            }
        }
        return false;
    }
    //college walah channel method-----------------------------------------------------------------------------
    public static int TotalSum(int[] arr){
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static boolean isPresent(int[] arr){
        int totalSum = TotalSum(arr);

        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }
}
