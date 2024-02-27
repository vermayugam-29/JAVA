import java.util.*;

class Ques33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node tree = new Node();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            int depth = sc.nextInt();
            tree.insertRoot(value);
        }
        solve(tree.root);
    }
    public static void solve(Node nodeT){
        Pair pair = new Pair();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(nodeT,0));

        Map<Integer,Integer> map = new TreeMap<>();

        while(!q.isEmpty()){
            Pair temp = q.poll();

            int cnt = temp.count;
            Node node1 = temp.node3;

            if(map.get(cnt) == null) map.put(cnt,node1.value);
            if(node1.left != null){
                q.add(new Pair(node1.left,cnt-1));
            }
            if(node1.right != null){
                q.add(new Pair(node1.right,cnt+1));
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        System.out.println(list);
    }
}
class Pair{
    public Pair(){}
    int count;
    Node node3;
    Pair(Node node,int cnt){
        this.count = cnt;
        this.node3 = node;
    }
}
class Node{
    public Node(){}
    int value;
    Node left,right;
    Node(int value){
        this.value = value;
    }
    Node root;

    public  void insertRoot(int value){
        root = insertNode(root,value);
    }
    public Node insertNode(Node node,int value){
        if(node == null){
            return new Node(value);
        }

        if(value < node.value){
            node.left = insertNode(node.left,value);
        }else{
            node.right = insertNode(node.right,value);
        }
        return node;
    }
}