import java.util.Scanner;
//LOWEST COMMON ANCESTOR
public class Ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int p = sc.nextInt();
        int q = sc.nextInt();

        TreeNode tree = new TreeNode();

        String[] str = s.split(" ");
        for (String string : str) {
            tree.insertRoot(Integer.parseInt(string));
        }

        TreeNode ans = findLCA(tree.root, p, q);
//        tree.display();
        System.out.println(ans.value);
    }

    private static TreeNode findLCA(TreeNode node, int p, int q) {
        if (node == null) return null;

        if (node.value == p || node.value == q) return node;

        TreeNode leftNode = findLCA(node.left, p, q);
        TreeNode rightNode = findLCA(node.right, p, q);

        if (leftNode != null && rightNode != null) return node;
        return leftNode == null ? rightNode : leftNode;
    }
}

class TreeNode {
    public  TreeNode(){}
    int value;
    TreeNode left, right;
    TreeNode root;

    TreeNode(int val) {
        this.value = val;
    }

    public void insertRoot(int value) {
        root = insertNodes(value, root);
    }

    private TreeNode insertNodes(int value, TreeNode node) {
        if (node == null) return new TreeNode(value);

        if (value < node.value) {
            node.left = insertNodes(value, node.left);
        } else {
            node.right = insertNodes(value, node.right);
        }

        return node;
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(TreeNode node, String details) {
        if (node == null) return;

        System.out.println(details + node.value);
        display(node.left, "Left node of " + node.value + " : ");
        display(node.right, "Right node of " + node.value + " : ");
    }
}
