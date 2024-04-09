import java.util.*;

public class FlattenLL {
    static TreeNode ans = new TreeNode(0);
    static TreeNode temp = ans;
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,6};
        TreeNode tree = new TreeNode();
        for (int i = 0; i < arr.length; i++) {
            tree.insertRoot(arr[i]);
        }
        preOrder(tree.root);
        temp.display(temp.root);
    }
    private static void preOrder(TreeNode root){
        if(root == null) return;

        temp.right = root;
        temp = temp.right;
        preOrder(root.left);
        preOrder(root.left);
    }
}
