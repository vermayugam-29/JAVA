import java.util.Scanner;

public class BinaryTree {
    //Constructor of main class
    private BinaryTree() {

    }
    private static class Node {
        int value;
        Node left;
        Node right;

        //Constructor
        public Node(int val){
            this.value = val;
        }
    }

    //root node
    private Node root;

    //insert elements
    private void insertRoot(Scanner sc){
        System.out.println("Enter the root Node : ");
        int value = sc.nextInt();
        root = new Node(value);

        insertNodes(sc,root);
    }

    private void insertNodes(Scanner sc,Node node){
        //for left node----------------------------------------
        System.out.println("Do you want to enter left of " + node.value + " :");
        boolean left = sc.nextBoolean();

        if(left){
            System.out.println("Enter the value of left of " + node.value +" :");
            int value = sc.nextInt();
            node.left = new Node(value);
            insertNodes(sc,node.left);
        }

        //for right node-----------------------------------------------------------------
        System.out.println("Do you want to enter right of " + node.value + " :");
        boolean right = sc.nextBoolean();

        if(right){
            System.out.println("Enter the value of right of " + node.value +" :");
            int value = sc.nextInt();
            node.right = new Node(value);
            insertNodes(sc,node.right);
        }
    }

    //displaying elements
    private void display() {
        display(root,"");
    }
    private void display(Node node,String space){
        if(node == null){
            //don't do anything j   ust return the function call
            return;
        }

        System.out.println(space + node.value);
        display(node.left,space +"\t"); //display left node
        display(node.right,space+"\t"); //display right node
    }
    //Main function------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BinaryTree tree =new BinaryTree();//creating object
        tree.insertRoot(sc);
        tree.display();
    }
}
