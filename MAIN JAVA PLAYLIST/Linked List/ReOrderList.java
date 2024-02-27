import java.util.Scanner;

public class ReOrderList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node list = new Node();

        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            list.add(data);
        }
        reOrder(list.head,list);
    }
    static void reOrder(Node head,Node list) {
        Node middle = getMid(head);
        Node mid = reverse(middle);

        Node res = new Node(0);  // Dummy node
        Node ans = res;

        Node temp1 = head;
        Node temp2 = mid;

        while (temp1 != null && temp1 != middle && temp2 != null) {
            ans.next = temp1;
            ans = ans.next;
            temp1 = temp1.next;

            ans.next = temp2;
            ans = ans.next;
            temp2 = temp2.next;
        }

        while (temp1 != null && temp1 != middle) {
            ans.next = temp1;
            ans = ans.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            ans.next = temp2;
            ans = ans.next;
            temp2 = temp2.next;
        }

        list.display(res.next);
    }
    static Node getMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node reverse(Node head) {
        if (head == null) return head;
        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) next = next.next;
        }
        return prev;
    }
}
