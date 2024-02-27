import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Triangle {
    static Integer[][] memo;
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>(List.of(2)));
        triangle.add(new ArrayList<>(List.of(3, 4)));
        triangle.add(new ArrayList<>(List.of(6, 5, 7)));
        triangle.add(new ArrayList<>(List.of(4, 1, 8, 3)));
        
        memo = new Integer[triangle.size() + 1][triangle.get(triangle.size() - 1).size() + 1];

        System.out.println(solve(triangle, 0, 0));
    }
    private static int solve(List<List<Integer>> list, int r, int c) {
        if (r >= list.size() || c >= list.get(r).size())
            return 0;
        if (memo[r][c] != null)
            return memo[r][c];

        int inc = list.get(r).get(c) + solve(list, r + 1, c);
        int exc = list.get(r).get(c) + solve(list, r + 1, c + 1);

        return memo[r][c] = Math.min(inc, exc);
    }
}
