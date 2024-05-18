import java.util.*;
public class Main {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        int[] arr = {5,3,9,17,2,4};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            tree.insertRoot(arr[i]);
        }

        tree.display();

        Scanner sc = new Scanner(System.in);
        TreeNode tree2 = new TreeNode();
        Queue<TreeNode> q = new LinkedList<>();
        int data = sc.nextInt();
        TreeNode  r = new TreeNode(data);
        tree2.root = r;
        q.offer(r);
        while (!q.isEmpty()){
            TreeNode curr = q.poll();
            data = sc.nextInt();
            if(data != -1){
                curr.left = new TreeNode(data);
                q.offer(curr.left);
            }
            data = sc.nextInt();
            if(data != -1){
                curr.right = new TreeNode(data);
                q.offer(curr.right);
            }
        }

        tree2.display();
    }
}
class TreeNode {
    public TreeNode(){}
    TreeNode left , right;
    public int val;
    TreeNode root;
    public TreeNode(int val){
        this.val = val;
    }

    public void insertRoot(int value){
        root = insertNodes(root,value);
    }
    public TreeNode insertNodes(TreeNode node , int value){
        if(node == null){
            return new TreeNode(value);
        }

        if(value < node.val){
            node.left = insertNodes(node.left , value);
        } else {
            node.right = insertNodes(node.right , value);
        }

        return node;
    }
    public void display(){
        display(root , "Root value : ");
    }
    void display(TreeNode node , String s){
        if(node == null) return;

        System.out.println(s + " :" + node.val);
        display(node.left,"Left Node of " +  node.val);
        display(node.right,"Right Node of " +node.val);
    }
}

