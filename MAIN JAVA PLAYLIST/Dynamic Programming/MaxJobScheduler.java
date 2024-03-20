public class MaxJobScheduler {
    static Integer[][] memo;
    static int n;
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        int days = 2;
        int ans = minDifficulty(arr,days);
        System.out.println(ans);
    }
    public static int minDifficulty(int[] arr, int d) {
        n = arr.length;
        if (n < d)
            return -1;
        memo = new Integer[n + 1][d + 1];
        return solve(arr, 0, d);
    }

    private static int solve(int[] arr, int idx, int d) {
        if (d == 1) { // base case;
            return max(arr, idx);
        }
        if (memo[idx][d] != null) {
            return memo[idx][d];
        }

        int maxDiff = 0;
        int finalRes = Integer.MAX_VALUE;
        for (int i = idx; i <= (n - d); i++) {
            maxDiff = Math.max(maxDiff, arr[i]); // maxdiff for curr day
            int res = maxDiff + solve(arr, i + 1, d - 1); // calculating sum of maxDiff for each day
            finalRes = Math.min(finalRes, res);// finding minimum from all posibilities
        }
        return memo[idx][d] = finalRes;
    }

    private static int max(int[] arr, int idx) {
        int max = arr[idx];
        for (int i = idx; i < n; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
