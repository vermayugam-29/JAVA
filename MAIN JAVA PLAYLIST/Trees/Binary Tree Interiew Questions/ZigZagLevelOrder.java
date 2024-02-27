import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ZigZagLevelOrder {
    public static List<List<Integer>> zig_zag(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans; //edge case

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        boolean reverse = false;
        while(!deque.isEmpty()){
            int size = deque.size();

            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                if(!reverse){ //meaning it is in normal order no need to reverse
                    TreeNode node = deque.removeFirst();
                    list.add(node.value);
                    if(node.left != null) deque.addLast(node.left);
                    if(node.right != null) deque.addLast(node.right);
                }else{
                    TreeNode node = deque.removeLast();
                    list.add(node.value);
                    if(node.right != null) deque.addFirst(node.right);//add right first because reverse
                    if(node.left != null) deque.addFirst(node.left);//then add left
                }
            }
            reverse = !reverse;
            ans.add(list);
        }
        return ans;
    }
}
