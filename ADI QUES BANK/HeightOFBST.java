import java.util.Scanner;

public class HeightOFBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node2 tree = new Node2();
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){
            int value = Integer.valueOf(arr[i]);
            tree.insertRoot(value);
        }
        int ans = height(tree.root);
        System.out.println(ans);

    }
    static int height(Node2 root){
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
}
class Node2 {
    public Node2(){}
    int value;
    Node2 left,right;
    public Node2(int val){
        this.value = val;
    }
    Node2 root;
    public void insertRoot(int value){
        root = insertNode(value,root);
    }
    public Node2 insertNode(int value,Node2 node){
        if(node == null){
            return new Node2(value);
        }

        if(value < node.value){
            node.left = insertNode(value,node.left);
        }else{
            node.right = insertNode(value,node.right);
        }

        return node;
    }
}
