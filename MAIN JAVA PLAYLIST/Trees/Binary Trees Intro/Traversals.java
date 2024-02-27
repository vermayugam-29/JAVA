public class Traversals {
    public static void main(String[] args) {
        int[] arr = {5,2,7,1,4,6,9,8,3,10};
        Traverse tree = new Traverse();
        tree.convert(arr);
        tree.InOrder();
    }
}
class Traverse{
    public class Node{
        int value;
        Node left;
        Node right;
        //Constructor:------>
        public Node(int val){
            this.value = val;
        }
    }

    public void insertRoot(int value) {
        root = insertNodes(value,root);
    }
    private Node insertNodes(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            //insert on left
            node.left = insertNodes(value,node.left);
        }
        if(value > node.value){
            //insert on right
            node.right = insertNodes(value,node.right);
        }

        return node;
    }
    //making root
    Node root;
    //preorder traversal------------------------------------------------------------------
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        //Print Node ----> Left ----> Right

        System.out.println(node.value + " "); //printing node
        preOrder(node.left); //Printing Left
        preOrder(node.right); //Printing right
    }

    //InOrder Traversal------------------------------------------------------------------
    public void InOrder(){
        preOrder(root);
    }
    private void InOrder(Node node){
        if(node == null){
            return;
        }
        //Print  Left ----> Node ----> Right

        InOrder(node.left); //Printing Left
        System.out.print(node.value + " "); //printing node
        InOrder(node.right); //Printing right
    }

    //PostOrder---------------------------------------------------------
    public void PostOrder(){
        preOrder(root);
    }
    private void PostOrder(Node node){
        if(node == null){
            return;
        }
        //Print  Left ---->  Right -----> Node

        PostOrder(node.left); //Printing Left
        PostOrder(node.right); //Printing right
        System.out.println(node.value + " "); //printing node
    }

    //converting array into a tree
    public void convert(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            insertRoot(arr[i]);
        }
    }
}