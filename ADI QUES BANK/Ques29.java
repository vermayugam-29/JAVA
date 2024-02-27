import java.util.Scanner;

public class Ques29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode tree = new TreeNode();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.insertRoot(value);
        }
        int path = sc.nextInt();
        System.out.println(pathSum(tree.root,path,0));
    }
    static boolean pathSum(TreeNode root, int target, int sum) {
        if (root == null) {
            return false;
        }

        sum += root.value;
        if (root.left == null && root.right == null) {
            return sum == target;
        }

        return pathSum(root.left, target, sum) || pathSum(root.right, target, sum);
    }
}
