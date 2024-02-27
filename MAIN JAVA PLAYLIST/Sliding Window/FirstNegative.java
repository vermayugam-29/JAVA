import java.util.*;

public class FirstNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(Arrays.toString(window(arr,k)));
    }

    private static int[] window(int[] arr,int k){
        int i = 0; // start of window
        int j = 0; // end of window

        ArrayList<Integer> list = new ArrayList<>();
        int ans[] = new int[arr.length - k + 1];
        int x = 0;//pointer for answer array

        //12 -1 -7 8 -15 30 16 28
        while(j < arr.length){
            if(arr[j] < 0){
                //calculations---------------------------------------
                list.add(arr[j]);
            }
            if(j-i+1 < k){
                j++;
            }
            else if(j-i+1 == k){
                //calculations----------------------------------------
                if(list.isEmpty()){
                    ans[x++] = 0;
                }
                else{
                    ans[x++] = list.get(0);
                    if(arr[i] == list.get(0)){
                        list.remove(0);
                    }
                }
                //moving window----------------------------------------
                i++;
                j++;
            }
        }
        return ans;
    }
}