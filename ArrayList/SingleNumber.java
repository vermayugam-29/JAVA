import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int ans = 0;
        // ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == num){
                    count++;
                }
            }
            if(count == 1) ans =num; 
        }
        System.out.println(ans);

    }
}
