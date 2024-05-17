import java.util.*;

public class implementation {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(1,3,6);
        graph.addEdge(3,2,4);
        graph.addEdge(1,4,6);
        graph.addEdge(2,5,6);
        graph.addEdge(5,6,6);
        graph.addEdge(6,7,6);

        graph.display();
    }
}
class Graph{
    Map<Integer,Map<Integer,Integer>> adj;
    public Graph(){
        adj = new HashMap<>();
    }
    public Graph(int v){
        adj = new HashMap<>();
        for (int i = 0; i <= v ; i++) {
            adj.put(i,new HashMap<>());
        }
    }
    public void addVertex(int v){
        adj.put(v,new HashMap<>());
    }
    public void addEdge(int v1,int v2,int weight){
        adj.get(v1).put(v2,weight);
        adj.get(v2).put(v1,weight);
    }
    public boolean containsEdge(int v1,int v2){
        return adj.get(v1).containsKey(v2);
    }
    public int getWeight(int v1,int v2){
        return adj.get(v1).get(v2);
    }
    public void display(){
        for(var e : adj.entrySet()){
            System.out.println(e.getKey() + " => " + e.getValue());
        }
    }
    public void removeEdge(int v1,int v2){
        adj.get(v1).remove(v2);
        adj.get(v2).remove(v1);
    }
    public void removeVertex(int v){
        for(int i : adj.get(v).keySet()){
            adj.get(i).remove(v);
        }
        adj.remove(v);
    }
}
