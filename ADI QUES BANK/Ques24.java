import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode node = new TreeNode();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            node.insertRoot(sc.nextInt());
        }
        leftView(node.root);
    }
    static void leftView(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.poll();
                if(currNode.left != null) queue.add(currNode.left);
                if(currNode.right != null) queue.add(currNode.right);

                if(i == 0){
                    System.out.print(currNode.value +" ");
                }
            }
        }
    }
}
