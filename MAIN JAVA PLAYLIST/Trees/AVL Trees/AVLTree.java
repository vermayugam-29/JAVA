public class AVLTree {
    public static void main(String[] args) {
        Tree treeObj = new Tree(); //Object

        for (int i = 0; i < 1000; i++) {
            treeObj.insertRoot(i);
        }

        System.out.println(treeObj.height());
    }
}
class Tree {
    public Tree() {}//Constructor

    public class Node{
        int value;
        Node right;
        Node left;
        int height;
        //Constructor :-------->
        public Node(int val){
            this.value = val;
        }

        public int getValue(){ return value; }
    }
    Node root;//creating root node

    public void insertRoot(int value){
        root = insertNodes(root,value);
    }

    public int height() {
        return height(root);
    }
    public int height(Node node){ //height of binary tree
        if(node == null) return -1; //means tree is empty
        return node.height;
    }

    private Node insertNodes(Node node,int value){
        //base case
        if(node == null){
            node = new Node(value);//make a new node and then add it by returning
            return node;
        }
        //adding smaller on left
        if(node.value < value){
            node.left = insertNodes(node.left,value);
        }
        //adding larger on right
        if(node.value > value){
            node.right = insertNodes(node.right,value);
        }

        //updating height at each node and then calculating overall height of tree
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        //in end return the node
        return rotateNode(node);
    }

    //rotating node
    private Node rotateNode(Node node){
        if(height(node.left)-height(node.right) > 1){
            //LEFT HEAVY
            //this means that there are more elements on left side, so we need to balance them
            if(height(node.left.left) - height(node.left.right) > 0){
                //this means it is LEFT-LEFT case
                //In order to balance them we need to right rotate the tree
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                //this means it is LEFT-RIGHT case
                //In order to balance them we need to left rotate the tree
                node.left = leftRotate(node.left);//first rotate left to bring parent,child and grandchild
                                                  //in a single line
                return rightRotate(node);//after they are in a single line just right rotate original node
            }
        }

        if(height(node.left)-height(node.right) < -1){ //or height(node.right) - height(node.left) > 0
            //RIGHT HEAVY
            //this means that there are more elements on right side, so we need to balance them
            if(height(node.right.left) - height(node.right.right) < 0){ //negative
                //this means it is RIGHT-RIGHT(because -ve) case
                //In order to balance them we need to right rotate the tree
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){ //positive
                //this means it is RIGHT-LEFT case
                //In order to balance them we need to left rotate the tree
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        //after performing all the operations just return the node that we took itself to the insertNode
        //function
        return node;
    }

    //RIGHT ROTATE FUNCTION
    public Node rightRotate(Node parentNode){
        Node childNode = parentNode.left; //left of parent node
        Node treeNode = childNode.right; //or parentNode.left.right / right of child node

        //now child will become parent in order to balance the tree
        childNode.right = parentNode;
        parentNode.left = treeNode;

        //update height
        parentNode.height = Math.max(height(parentNode.left),height(parentNode.right)) + 1;
        childNode.height = Math.max(height(childNode.left),height(childNode.right)) + 1;

        //now new node is child so return it
        return childNode;
    }

    //LEFT ROTATE FUNCTION
    public Node leftRotate(Node childNode){
        Node parentNode = childNode.right; //right of child node
        Node treeNode = parentNode.left; //or childNode.right.left / left of parent node


        parentNode.left = childNode;
        childNode.right = treeNode;

        //update height
        parentNode.height = Math.max(height(parentNode.left),height(parentNode.right)) + 1;
        childNode.height = Math.max(height(childNode.left),height(childNode.right)) + 1;

        //now new node is parent so return it
        return parentNode;
    }
    public void populate(int[] arr){
        for (int j : arr) {
            this.insertRoot(j);
        }
    }
}
