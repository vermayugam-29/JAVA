import java.util.Arrays;

class Solution {
    public static int minOperations(int[] nums, int k) {
        int cnt = 0;
        while (true) {
            int[] ans = findMin(nums, k);
            System.out.println(Arrays.toString(ans));
            int res = 0;
            if (ans[1] < Integer.MAX_VALUE) {
                res = Math.min(ans[0], ans[1]) * 2 + Math.max(ans[0], ans[1]);
                fill(nums, ans, res);
            }
            System.out.println(Arrays.toString(nums));
            if (check(nums, k))
                break;
        }
        for (int i : nums) {
            if (i >= k)
                cnt++;
        }
        return cnt;
    }

    private static int[] findMin(int[] a, int k) {
        int[] ans = new int[2];
        ans[0] = a[0];
        ans[1] = Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {
            if (a[i] >= k || a[i] == -1)
                continue;
            else if (a[i] < ans[0]) {
                ans[1] = ans[0];
                ans[0] = a[i];
            } else if (a[i] > ans[0] && a[i] < ans[1]) {
                ans[1] = a[i];
            }
        }
        return ans;
    }

    private static void fill(int[] arr, int[] ans, int res) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= ans[0] && arr[i] <= ans[1]) {
                arr[i] = res;
                cnt++;
            }
        }
    }

    private static boolean check(int[] arr, int k) {
        for (int i : arr) {
            if (i != -1 || i < k)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 11, 10, 1, 3};
        int k = 10;
        System.out.println(minOperations(arr, k));
    }
}
