import java.util.ArrayList;
import java.util.*;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        TreeNode tree = new TreeNode();
        for (int i=0;i<7;i++){
            int value = sc.nextInt();
            tree.insertRoot(value);
        }
        delete(tree.root);
        postOrder(tree.root);
    }
    public static void delete(TreeNode root){
        if(root == null) return;

        if(root.left != null && root.left.left == null && root.left.right == null){
            root.left = null;
        }

        if(root.right != null && root.right.left == null && root.right.right == null){
            root.right = null;
        }

        delete(root.left);
        delete(root.right);
    }
    public static void postOrder(TreeNode root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }
}
