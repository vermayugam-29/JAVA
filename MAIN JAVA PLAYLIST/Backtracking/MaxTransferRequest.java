public class MaxTransferRequest {
    private static int dfs(int[][] requests, int idx, int[] buildings) {
        if (idx >= requests.length) {
            for (int i : buildings) {
                if (i != 0) return Integer.MIN_VALUE;
            }
            return 0;
        }


        int from = requests[idx][0];
        int to = requests[idx][1];
        buildings[from]--;//jaha se jaha rahe ha vaha se ghata denge
        buildings[to]++;//jaha par ja rahe ha vaha par badha denge
        int include = 1 + dfs(requests, idx + 1, buildings);
        buildings[from]++; //backTracking
        buildings[to]--;//backTracking

        int exclude = dfs(requests, idx + 1, buildings);
        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] requests = {
                {0,1},
                {1,0},
                {0,1},
                {1,2},
                {2,0},
                {3,4}
        };
        int ans = dfs(requests, 0, new int[n]);
        System.out.println(ans);
    }
}
