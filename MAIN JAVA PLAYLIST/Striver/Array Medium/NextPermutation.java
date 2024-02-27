import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = sc.nextInt();
        }
        boolean checking = isSorted(arr);
        if(checking == true) swap(arr,n-2,n-1);
        else swap(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
        // System.out.println(checking);
    }
    public static boolean isSorted(int[] arr){
        boolean check = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                check = true;
            }
            else{
                check=false;
            }
        }
        return check;
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
