import java.util.Scanner;

public class RecursiveInsertLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node list = new Node();
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            list.add(data);
        }
        list.display();
        list.addIdx(2,3);
        list.display();
    }
}
class Node {
    public Node head,tail;
    int size;
    public Node(){
        this.size=0;
    }

    Node next;
    int value;
    public Node (int val){
        this.value = val;
    }
    public Node (int val, Node next){
        this.value = val;
        this.next = next;
    }

    public void addFirst(int val){
        Node temp = new Node(val);

        temp.next = head;
        head = temp;
        if(tail == null) tail = head;
        size++;
    }
    public void add(int val){
        Node node = new Node(val);
        if(head == null){
            node.next = head;
            head = node;
            size++;
            return;
        }

        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = node;
        size++;
    }
    public void addIdx(int val,int idx){
        head = add(val,idx,head);
    }
    public Node add(int val, int index, Node node){
        if (index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = add(val,index-1,node.next);
        return node;
    }

    public void display (){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void display (Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
