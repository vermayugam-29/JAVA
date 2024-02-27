class TreeNode{
    int data;
    TreeNode left = null, right = null;

    TreeNode(int data){
        this.data = data;
    }
}

class Node{
    TreeNode root;
    int flag = 1;
    void insertRandom(int data){
        if(root == null){
            root = new TreeNode(data);
        }else{
            TreeNode temp = root;
            if(flag == 1){

                while(temp.left != null){
                    temp = temp.left;
                }
                temp.left = new TreeNode(data);
            }
            else{
                while(temp.right != null){
                    temp = temp.right;
                }
                temp.right = new TreeNode(data);
            }

        }
        flag *= -1;
    }
    public void display(TreeNode node, String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.data);

        display(node.left,"Left child of " + node.data +" :");
        display(node.right,"Right child of " + node.data +" :");
    }
}

public class InputBinaryTree {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node node = new Node();
        for(int i : arr){
            node.insertRandom(i);
        }

        node.display(node.root, "");
    }
}
