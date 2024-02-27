public class DiameterOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(findDiameter(root));
    }
    public static int findDiameter(TreeNode root){
        height(root);
        return diameter-1;
    }
    static int diameter = 0;
    static int height(TreeNode node){
        //base case
        if(node == null) return 0;

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight +1;
        diameter = Math.max(diameter,dia);

        return Math.max(leftHeight,rightHeight) + 1;
    }
}
