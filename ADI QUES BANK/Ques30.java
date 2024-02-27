import java.util.*;

public class Ques30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeNode tree = new TreeNode();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.insertRoot(value);
        }
        int key = sc.nextInt();
        inOrderSuccessor(tree.root);
        int idx = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) == key){
                idx = i + 1;
                break;
            }
        }
        System.out.println(list.get(idx));
    }
    static List<Integer> list = new ArrayList<>();
    static void inOrderSuccessor(TreeNode root){
        if(root == null) return;

        inOrderSuccessor(root.left);
        list.add(root.value);
        inOrderSuccessor(root.right);
    }
}
