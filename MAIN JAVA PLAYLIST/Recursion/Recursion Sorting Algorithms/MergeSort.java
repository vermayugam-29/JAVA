import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    static int[] merge(int[] left,int[] right){
        int[] ans = new int[left.length + right.length];

        int i = 0;
        int j = 0;

        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                ans[k] = left[i];
                i++;
            }
            else{
                ans[k] = right[j];
                j++;
            }
            k++;
        }
        //if elements are still remaining
        while(i<left.length){
            ans[k++] = left[i++];
        }
        while (j<right.length){
            ans[k++] = right[j++];
        }

        return ans;
    }
}
