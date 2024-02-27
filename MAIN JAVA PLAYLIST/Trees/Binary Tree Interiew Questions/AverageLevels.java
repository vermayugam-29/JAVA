import java.util.*;
public class AverageLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            double average = 0;
            for(int i=0;i<levelSize;i++){
                TreeNode currNode = queue.poll();

                average += currNode.value;

                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
            }
            double avg = average/levelSize;
            ans.add(avg);
        }
        return ans;
    }
}