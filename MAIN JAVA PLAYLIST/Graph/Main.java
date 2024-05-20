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
            if(sc.hasNext()){
                data = sc.nextInt();
                if(data != -1){
                    curr.left = new TreeNode(data);
                    q.offer(curr.left);
                }
            }
            if(sc.hasNext()){
                data = sc.nextInt();
                if(data != -1){
                    curr.right = new TreeNode(data);
                    q.offer(curr.right);
                }
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
        display(root , "Root value");
    }
    void display(TreeNode node , String s){
        if(node == null) return;

        System.out.println(s + " :" + node.val);
        display(node.left,"Left Node of " +  node.val);
        display(node.right,"Right Node of " +node.val);
    }
}
//import java.util.Scanner;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int val) {
//        this.val = val;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//public class Main {
//    private static Scanner sc;
//
//    // Function to take input and construct the binary tree
//    public static TreeNode buildTree() {
//        int val = sc.nextInt();
//        if (val == -1) {
//            return null;
//        }
//
//        TreeNode root = new TreeNode(val);
//        root.left = buildTree();
//        root.right = buildTree();
//
//        return root;
//    }
//
//    // Function to print the tree in pre-order (for testing purposes)
//    public static void preOrder(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//        System.out.print(root.val + " ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }
//
//    public static void main(String[] args) {
//        sc = new Scanner(System.in);
//        System.out.println("Enter the values of the tree in pre-order (use -1 for null nodes):");
//        TreeNode root = buildTree();
//        System.out.println("Pre-order traversal of the constructed tree:");
//        preOrder(root);
//    }
//}
