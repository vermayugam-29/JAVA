import java.util.*;
/*
7
2 2 3
2 1 5
3 1 4 6
1 3
2 2 7
2 3 7
2 5 6
 */
public class CycleDetectBFS {
    private static boolean bfs(List<List<Integer>> adj, boolean[] vis,int start){
        vis[start] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start,-1});

        while (!q.isEmpty()){
            int node = q.peek()[0];
            int parent = q.poll()[1];

            for(int i : adj.get(node)){
                if(!vis[i]){
                    vis[i] = true;
                    q.offer(new int[]{i,node});
                } else if(parent == i){
                    continue; //meaning current node
                            // we are trying to visit is the node from where node came from
                } else {
                    return true;
                }
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
                if(bfs(adj,vis,i)){
                    System.out.println(true);
                    return;
                }
            }
        }

        System.out.println(false);
    }
}
