import java.nio.channels.Pipe;
import java.util.*;

public class TopView {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.right.left = new Node(6);

        root.right.right = new Node(7);

        System.out.println(topView(root));
    }
    public static ArrayList<Integer> topView(Node root)
    {
        if(root == null) return new ArrayList<Integer>();
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<Pair>();
        queue.add(new Pair(root, 0));

        while(!queue.isEmpty()){

            Pair temp = queue.poll();

            int cnt = temp.count;
            Node node = temp.node;

            if(map.get(cnt) == null) map.put(cnt,node.value);
            if(node.left != null){
                queue.add(new Pair(node.left,cnt-1));
            }
            if(node.right != null){
                queue.add(new Pair(node.right,cnt+1));
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(map.values());
        return ans;
    }
}
class Pair{
    int count;
    Node node;
    Pair(Node root,int cnt){
        this.count = cnt;
        this.node = root;
    }
}
class Node {
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
    }
}
