import java.util.*;

public class DetectCycleDFS {
    private static boolean dfs(List<List<Integer>> adj, boolean[] vis, int node, int parent){
        vis[node] = true;

        for(int i : adj.get(node)){
            if(!vis[i]){
                if(dfs(adj,vis,i,node)){
                    return true;
                }
            } else if(i != parent){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>());

        for(int i = 1; i <= n; i++){
            int numOfEle = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < numOfEle; j++){
                list.add(sc.nextInt());
            }
            adj.add(list);
        }

        System.out.println(adj);

        boolean[] vis = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!vis[i]){
                if(dfs(adj,vis,i,-1)){
                    System.out.println(true);
                    return;
                }
            }
        }

        System.out.println(false);
    }
}
