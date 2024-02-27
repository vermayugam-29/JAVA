import java.util.*;

public class BinarySearchTree {
    public static void main(String[] args) {
        Tree tree = new Tree();

        int[] arr = {7,8,3,4,1,2,10,9,5,6};

        tree.populate(arr);
        tree.display();

//        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
//        tree.populateSorted(arr2);
//        tree.display();
    }
}
class Tree{
    public Tree(){}
    public class Node{
        int value;
        Node left;
        Node right;
        int height;

        //constructor
        public Node (int val){
            this.value = val;
        }

        public int getValue() {
            return value;
        }
    }

    Node root;//root node
    public int height() {
        return height(root);
    }
    public int height(Node node){ //height of binary tree
        if(node == null) return -1; //means tree is empty
        return node.height;
    }
    public boolean isEmpty(){
        return root == null; //if root null tree is empty
    }

    public void insertRoot(int value) {
        root = insertNode(value,root);
    }
    //inserting in nodes
    public Node insertNode(int value,Node node){
        //base case
        if(node == null){
            node = new Node(value); //create an int value and store it in node and return it
            return node; //now return it
        }
        //put smaller one on left
        if(value < node.value){
            //insert on left side
            node.left = insertNode(value,node.left);
        }

        //put larger on right
        if(value > node.value){
            //insert on right side
            node.right = insertNode(value,node.right);
        }

        //updating height of the tree
        node.height = Math.max(height(node.right) , height(node.left)) + 1;
        //now  return whatever node we are at
        return node;
    }
    //check if tree is balanced or not
    public boolean balanced() {
        return isBalanced(root);
    }
    private boolean isBalanced(Node node){
        if(node == null) return true;

        return Math.abs(height(node.left)-height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }
    //displaying
    public  void display() {
        display(this.root,"Root Node : ");
    }
    private void display(Node node,String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.value);

        display(node.left,"Left child of " + node.value +" :");
        display(node.right,"Right child of " + node.value +" :");
    }
    public void populate(int[] arr){
        for (int j : arr) {
            insertRoot(j);
        }
    }
    //for sorted array---------------------------------------------------------
    public void populateSorted(int[] arr){
        populateSorted(arr,0,arr.length);
    }
    private void populateSorted(int[] arr,int start,int end){
        if(start >= end) return;

        int mid = (start+end)/2;

        insertRoot(arr[mid]);
        populateSorted(arr,start,mid);
        populateSorted(arr,mid+1,end);
    }
}