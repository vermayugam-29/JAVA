import java.util.*;

public class BFSTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjacencyList.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            int node = sc.nextInt();
            int count = sc.nextInt();
            for(int j=0;j<count;j++){
                adjacencyList.get(node).add(sc.nextInt());
            }
        }

        bfs(adjacencyList,0);
    }
    static void bfs(List<List<Integer>> list,int node){
        int n = list.size();
        boolean[] visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();

        visited[node] = true;
        q.offer(node);

        while(!q.isEmpty()){
            int node1 = q.poll();

            System.out.print(node1 + " ");

            for(int i : list.get(node1)){
                if(!visited[i]){
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }

}
