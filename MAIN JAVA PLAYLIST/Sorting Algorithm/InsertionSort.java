import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        insertion(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int[] arr,int n){
        int j = 0;
        for(int i=0;i<arr.length-1;i++){
            for(j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else if(arr[j]>arr[j-1]){
                    break;
                }
            }
            j++;
        }
    }
}
