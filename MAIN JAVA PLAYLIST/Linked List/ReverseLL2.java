import java.util.Scanner;

public class ReverseLL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node list = new Node();

        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            list.add(data);
        }
        System.out.print("Before --- > ");
        list.display();
        System.out.print("After --- > ");
        reverse(list.head,list,2,4);
    }
    static void reverse(Node head,Node list,int left,int right){
        if(left == right){
            list.display(head);
            return;
        }

        Node prev = null; //null
        Node curr = head; //1

        for (int i = 0;curr!=null && i < left-1; i++) {
            prev = curr;
            curr = curr.next;
        }

        Node last = prev;
        Node endNode = curr;

        Node next = curr.next;
        for(int i = 0 ;curr!=null && i < (right - left + 1) ; i++){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next!=null) next = next.next;
        }
        if(last != null) last.next = prev;
        else head = prev;

        endNode.next = curr;

        list.display(head);
    }
}
