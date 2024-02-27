import java.util.*;

public class MedianInStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();
        int n = sc.nextInt();

        while(test_case > 0){
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] ans = new int[n];
            median(arr,ans);
            test_case--;
        }
    }
    static void median(int[] arr,int[] ans){
        int k = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j <= i; j++) {
                list.add(arr[j]);
            }
            Collections.sort(list);;
            if(list.size()%2 != 0 || list.size() == 1){
                ans[k++] = list.get(list.size()/2);
            }
            else if(list.size()%2 == 0){
                int a = (list.size()-1)/2;
                ans[k++] = (list.get(a) + list.get(a+1))/2;
            }
            list.clear();
        }
        System.out.println(Arrays.toString(ans));
    }

}