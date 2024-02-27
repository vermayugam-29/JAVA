import java.util.Arrays;
import java.util.Scanner;

public class arrayFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {3 , 5 , 78 , 56 , 67};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
