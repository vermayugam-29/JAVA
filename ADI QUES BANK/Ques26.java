import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode tree = new TreeNode();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.insertRoot(value);
        }
        postOrder(tree.root);
        System.out.println(list);
    }
    static List<Integer> list = new ArrayList<>();
    static void postOrder(TreeNode root){ //LEFT --- RIGHT --- NODE
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        list.add(root.value);
    }
}
