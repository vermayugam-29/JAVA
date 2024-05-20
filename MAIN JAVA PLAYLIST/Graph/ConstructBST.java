import java.util.HashMap;
import java.util.Map;

public class ConstructBST {
    public static void main(String[] args) {
        int[] in = {9,3,15,20,7};//{4,2,5,1,3,6};
        int[] pre = {3,9,20,15,7};//{1,2,4,5,3,6};
        int n = in.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < in.length; i++){
            map.put(in[i],i);
        }
        TreeNode root = dfs(pre,0,n-1,0,n-1,map);
        postOrder(root);
    }
    private static void postOrder(TreeNode root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
    private static TreeNode dfs(int[] pre,int preS,int preE,int inS,int inE,Map<Integer,Integer> map){
        if(inS > inE || preS > preE){
            return null;
        }

        TreeNode root = new TreeNode(pre[preS]);

        int rootId = map.get(pre[preS]);
        int numLeft = rootId - inS;

        root.left = dfs(pre,preS+1,preS+numLeft,inS,rootId-1,map);
        root.right = dfs(pre,preS+numLeft+1,preE,rootId+1,inE,map);

        return root;
    }
}