import java.util.Scanner;

public class Ques31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeNode tree = new TreeNode();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.insertRoot(value);
        }
        height(tree.root);
        System.out.println(diameter);
    }
    static int diameter = 0;
    static int height(TreeNode root){
        if(root == null) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(dia,diameter);

        return Math.max(leftHeight,rightHeight) + 1;
    }
}
