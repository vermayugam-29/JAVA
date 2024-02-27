import java.util.Arrays;
import java.util.Scanner;

public class swapArray {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int[] arr = {2 , 4, 5, 67, 89};
        swap(arr, 0,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr ,int index0 , int index3){
        int temp = arr[index0];
        arr[index0] = arr[3];
        arr[index3] = temp ;
    }
}
