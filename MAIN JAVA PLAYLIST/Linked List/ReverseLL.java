import java.util.*;

public class ReverseLL {
    public static void main(String[] args) {
        Node list = new Node();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            list.add(data);
        }
        list.display();
        iterativeRev(list.head,list);
        list.display();
    }
    public static void iterativeRev(Node head,Node list){
        if(head == null) return;

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while (present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null) next = next.next;
        }
        list.head = prev;
    }
    public static void RecursiveRev(Node node,Node list){
        if(node == list.tail){
            list.head = list.tail;
            return;
        }

        RecursiveRev(node.next,list);

        list.tail.next = node;
        list.tail = node;
        list.tail.next = null;
    }
    static void reverseList(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while(temp!=null){
            stack.push(temp.value);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null && !stack.isEmpty()){
            temp.value = stack.pop();
            temp = temp.next;
        }
        head.display(head);
    }
}
