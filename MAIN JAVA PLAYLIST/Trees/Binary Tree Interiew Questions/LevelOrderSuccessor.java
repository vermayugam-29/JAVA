import java.util.*;
public class LevelOrderSuccessor {
    public static TreeNode successor(TreeNode root,int k){
        if(root == null) return null; //edge case

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();

            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);

            if(node.value == k) break;

        }


        return queue.isEmpty() ? root : queue.poll();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root .right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.right.left.left = new TreeNode(8);
        root.right.right.right = new TreeNode(9);

        System.out.println(successor(root,9).value);

    }
}
