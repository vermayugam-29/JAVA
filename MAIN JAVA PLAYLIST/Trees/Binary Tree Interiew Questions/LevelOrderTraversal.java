import com.sun.source.tree.Tree;

import java.util.*;

class LevelOrderTraversal {
    public static void main(String[] args) {
        //Calling object
        TreeNode tree = new TreeNode();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int value = sc.nextInt();
            tree.insertRoot(value);
        }

        System.out.println(levelOrder(tree.root));
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        //edge case
        if(root == null) return ans;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            //size of queue for  current level
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<levelSize;i++){
                TreeNode currNode = queue.poll();
                //add curr node in list
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                //now same for right node
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
                list.add(currNode.value);
            }
            //now add all the elements of list in result list
            ans.add(list);
        }

        return ans;
    }
}
class TreeNode {
      TreeNode() {}
      int value;
      TreeNode left,right;
      TreeNode(int val) {
          this.value = val;
          left = right = null;
      }
      TreeNode root;
      public void insertRoot(int value){
          root = insertNode(root,value);
      }
      public TreeNode insertNode(TreeNode node,int value){
          if(node == null) return new TreeNode(value);

          if(value < node.value){
              node.left = insertNode(node.left,value);
          }else{
              node.right = insertNode(node.right,value);
          }
          return node;
      }
      public  void display(){
          display(root,"Root Node :" );
      }
      private void display(TreeNode node,String s){
          if(node == null) return;

          System.out.println(s + " " + node.value);
          display(node.left,"Left Node of " + node.value +" :");
          display(node.right,"Right node of " + node.value +" :");

      }
 }
