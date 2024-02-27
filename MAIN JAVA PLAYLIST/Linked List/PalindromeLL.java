import java.util.Scanner;

public class PalindromeLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node list = new Node();

        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            list.add(data);
        }

        System.out.println(isPalindrome(list.head,list));
    }
    static boolean isPalindrome(Node head,Node list){
        Node mid = getMid(head);
        list.display(head);
        Node prev = null;
        Node curr = mid;
        Node next = curr.next;

        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null) next = next.next;
        }

        Node temp1 = head;
        Node temp2 = prev;

        while (temp1 != mid && temp2 != null){
            if(temp1.value != temp2.value) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }
    static Node getMid(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
