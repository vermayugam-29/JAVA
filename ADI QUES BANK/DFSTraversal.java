import java.util.ArrayList;
import java.util.Scanner;

public class DFSTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int node = sc.nextInt();
            int count = sc.nextInt();
            for (int j = 0; j < count; j++) {
                int neighbour = sc.nextInt();
                adjacencyList.get(node).add(neighbour);
            }
        }
        boolean[] visited = new boolean[n];
        dfs(adjacencyList, 0, visited);
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adjacencyList, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adjacencyList.get(node)) {
            if (!visited[neighbor]) {
                dfs(adjacencyList, neighbor, visited);
            }
        }
    }
}
