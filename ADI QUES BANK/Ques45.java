import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  s = sc.nextLine().trim();
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(solve(arr));
    }
    static int solve(int[] arr){
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue() == 1){
                return e.getKey();
            }
        }
        return -1;
    }
}
