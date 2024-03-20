import java.util.*;

public class FrogJumpLeetCode {
    static Map<Integer,Integer> map;
    static Boolean[][] memo;
    public static boolean canCross(int[] stones) {
        memo = new Boolean[stones.length+1][stones.length+1];
        map = new HashMap();
        for(int i=0;i<stones.length;i++){
            map.put(stones[i],i);
        }
        return solve(stones,0,0);
    }
    private static boolean solve(int[] arr,int start,int k){
        if(start == arr.length-1) return true;
        if(start >= arr.length) return false;
        if(memo[start][k] != null) return memo[start][k];

        boolean temp = false;
        for(int i=-1;i<=1;i++){
            int jumpTo = arr[start] + (k+i);
            if(k+i <= 0) continue;
            if(map.containsKey(jumpTo)){
                temp = temp || solve(arr,map.get(jumpTo),k+i);
            }
        }
        return memo[start][k] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,3,5,6,8,12,17};
        boolean ans = canCross(arr);
        System.out.println(ans);
    }
}
