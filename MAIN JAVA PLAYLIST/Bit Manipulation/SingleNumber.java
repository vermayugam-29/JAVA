import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(singleNumber(arr));
    }
    static int singleNumber(int[] nums){
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
