public class MinCostTickets {
    static Integer[] memo;

    public static int mincostTickets(int[] days, int[] costs) {
        memo = new Integer[days.length + 1];
        return solve(days, costs, 0);
    }

    private static int solve(int[] arr, int[] val, int i) {
        if (i >= arr.length)
            return 0;
        if (memo[i] != null)
            return memo[i];

        int day1 = val[0] + solve(arr, val, i + 1);
        int j = i;
        while (j < arr.length && (arr[i] + 6) >= arr[j]) {
            j++;
        }
        int day2 = val[1] + solve(arr, val, j);
        int k = i;
        while (k < arr.length && (arr[i] + 29) >= arr[k]) {
            k++;
        }
        int day3 = val[2] + solve(arr, val, k);

        return memo[i] = Math.min(day1, Math.min(day2, day3));
    }

    public static void main(String[] args) {
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};
        int ans = mincostTickets(days,costs);
    }
}
