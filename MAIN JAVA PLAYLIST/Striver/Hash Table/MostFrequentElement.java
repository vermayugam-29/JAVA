import java.util.*;

public class MostFrequentElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(!mpp.containsKey(arr[i])){
                mpp.put(arr[i], 1);
            }
            else{//if already present
                mpp.put(arr[i], mpp.get(arr[i])+1);
            }
        }

        // System.out.println(mpp.entrySet());
        int maxCount = 0;//no of time ansKey occur
        int ansKey = Integer.MIN_VALUE; //no that occurs max times in arr
        for(var e : mpp.entrySet()){
            if(e.getValue() > maxCount){
                ansKey = e.getKey();
                maxCount = e.getValue();
            }
        }
        System.out.println(ansKey);//no that occurs max time in array = ansKey
        System.out.println(maxCount);
    }
}
