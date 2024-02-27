import java.util.*;

public class index {
    public static int singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num)) {
                list.remove(Integer.valueOf(num));
            } else {
                list.add(num);
            }
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int num = 0;
        // System.out.println(singleNumber(nums)); // Output: 1
        for(int i = 0; i < nums.length; i++){
            num = num ^ nums[i];
            System.out.print(num + " ");
        }

        // System.out.println(num);
    }
}
