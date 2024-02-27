import java.util.*;

public class SubarrayDistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc .nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Sum(arr,n));
        System.out.println(bhallaMethod(arr,n));
    }
    //bhalla method-----------------------------------------------------
    public static int bhallaMethod(int[] arr,int n){
        int count = 0;
        for(int i=0;i<n;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=i;j<n;j++){
                if(list.contains(arr[j])){
                    break;
                }
                else{
                    list.add(arr[j]);
                    count += list.size();
                }
            }
        }
        return count;
    }
    //my method--------------------------------------------------------
    public static int Sum(int[] arr,int n){
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    list.add(arr[k]);
                }
                if(isDistinct(list)){
                    sum += list.size();
                }
                list.clear();
            }
        }
        return sum;
    }
    static boolean isDistinct(ArrayList<Integer> list){
        HashSet<Integer> set = new HashSet<>(list);
        return set.size() == list.size();
    }
}
