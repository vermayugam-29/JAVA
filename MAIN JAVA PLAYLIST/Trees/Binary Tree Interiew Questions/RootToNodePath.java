import java.util.*;

public class RootToNodePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode tree = new TreeNode();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            tree.insertRoot(value);
        }
        int key = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        pathPrint(tree.root,key,list);
        System.out.println(list);
    }

    static boolean pathPrint(TreeNode root,int key,List<Integer> list){
        if(root == null) return false;

        list.add(root.value);
        if(root.value == key) return true;

        if( pathPrint(root.left,key,list) || pathPrint(root.right,key,list)) return true;

        list.remove(list.size()-1);

        return false;
    }
}
