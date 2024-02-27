import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AVL tree = new AVL();

        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            int value = sc.nextInt();
            tree.insertRoot(value);
        }
        preOrder(tree.root);
    }
    public static void preOrder(AVL root){
        if(root == null) return;

        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
class AVL {
    public AVL(){}
    int value;
    AVL left,right;
    public AVL(int val){
        this.value = val;
    }
    AVL root;
    int height;

    public void insertRoot(int value){
        root = insertNodes(root,value);
    }
    private AVL insertNodes(AVL node,int value){
        if(node == null) return new AVL(value);

        if(value < node.value){
            node.left = insertNodes(node.left,value);
        }else{
            node.right = insertNodes(node.right,value);
        }

        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return rotate(node);
    }
    //HEIGHT OF TREE
    public int height() {
        return height(root);
    }
    public int height(AVL node){ //height of binary tree
        if(node == null) return -1; //means tree is empty
        return node.height;
    }
    //ROTATION FUNCTION
    public AVL rotate(AVL node){
        if(height(node.left) - height(node.right) > 1){
            //LEFT-LEFT CASE
            if(height(node.left.left) - height(node.left.left) > 0) {
                return rightRotate(node);
            }
            //LEFT-RIGHT CASE
            if(height(node.left.left) - height(node.left.right) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.right) - height(node.left) > 1){
            //RIGHT-RIGHT CASE
            if(height(node.right.right) - height(node.right.left) > 0){
                return leftRotate(node);
            }
            //RIGHT-LEFT CASE
            if(height(node.right.left) - height(node.right.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }
    //RIGHT ROTATE FUNCTION
    public AVL rightRotate(AVL Parent){
        AVL child = Parent.left;
        AVL tree = child.right;

        child.right = Parent;
        Parent.left = tree;

        //update height
        Parent.height = Math.max(height(Parent.left),height(Parent.right)) + 1;
        child.height = Math.max(height(child.left),height(child.right))+1;

        return child;
    }
    //LEFT ROTATE FUNCTION
    public AVL leftRotate(AVL child){
        AVL parent = child.right;
        AVL tree = parent.left;

        parent.left = child;
        child.right = tree;

        parent.height = Math.max(height(parent.left),height(parent.right)) + 1;
        child.height = Math.max(height(child.right),height(child.left)) + 1;

        return parent;
    }
}
