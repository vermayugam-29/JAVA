import java.util.*;

public class KFrequentStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();

        int n = sc.nextInt();//size of array
        int k = sc.nextInt();

        while(test_case > 0){
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Solution(arr,n,k);
            test_case--;
        }
    }
    public static void Solution(int[] arr,int n,int k){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                list.add(arr[j]);
            }
            answer.addAll(Check(list,k));
            list.clear();
        }
        System.out.println(answer);
    }
    public static ArrayList<Integer> Check(ArrayList<Integer> list,int k){
        Map<Integer,Integer> map =new LinkedHashMap<>();

        for (Integer integer : list) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }

        int x = list.get(list.size()-1);
        int frq = map.get(x);

        ArrayList<Integer> list2 = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()<=frq){
                list2.add(e.getKey());
            }
        }
        Collections.sort(list2);
        if(list2.size() > k){
            ArrayList<Integer> list3 = new ArrayList<>(list2.subList(0,k));
            return list3;
        }

        return list2;
    }
}
