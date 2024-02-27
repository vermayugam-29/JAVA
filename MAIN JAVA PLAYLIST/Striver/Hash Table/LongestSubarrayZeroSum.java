import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubarrayZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Longest(arr, n));
    }
    public static int Longest(int[] arr,int n){
        Map<Integer,Integer> map= new HashMap<>();
        //<prefSum,index>
        int prefSum = 0;
        int maxLen = 0;
        map.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            if(map.containsKey(prefSum)){
                maxLen = Math.max(maxLen,i - map.get(prefSum));
            }
            else{
                map.put(prefSum,i);
            }
        }
        return  maxLen;
    }
}
