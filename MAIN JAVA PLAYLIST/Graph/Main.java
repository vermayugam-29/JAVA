import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int data = sc.nextInt();
        TreeNode root = new TreeNode(data);

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

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

        display(root,"Root value");
    }
    private static void display(TreeNode root , String s){
        if(root == null) return;

        System.out.println(s +" :" + root.val);
        display(root.left,"Left Node of " + root.val);
        display(root.right,"Right Node of " + root.val);
    }
}
class TreeNode {
    TreeNode left , right;
    public int val;
    public TreeNode(int val){
        this.val = val;
    }
}