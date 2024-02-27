import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int k = sc.nextInt();

        for(int i=0;i< list.size();i++){
            if(list.get(i) == k){
                list.remove(i);
                break;
            }
        }
        TreeNode tree = new TreeNode();
        for(int i=0;i< list.size();i++){
            tree.insertRoot(list.get(i));
        }
//        tree.display();
        solve(tree.root);
    }
    static void  solve(TreeNode root){
        if(root == null) return;

        solve(root.left);
        solve(root.right);
        System.out.print(root.value+" ");
    }
}
