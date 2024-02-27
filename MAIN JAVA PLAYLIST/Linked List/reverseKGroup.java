import java.util.Scanner;

public class reverseKGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node list = new Node();

        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            list.add(data);
        }
        reverse(list.head,list,3);
    }
    static void reverse(Node head,Node list,int k){
        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while (true) {
            Node last =prev;
            Node endNode = curr;

            int j = 0;
            Node temp = curr;
            for(int i = 0;i < k ;i ++ ){
                if(temp == null) break;
                temp = temp.next;
                j++;
            }
            System.out.println(j);
            if(j != k) break;
            else {
                for (int i = 0; curr != null && i < k; i++) {
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                    if (next != null) next = next.next;
                }
                if (last != null) last.next = prev;
                else head = prev;
                endNode.next = curr;
                prev = endNode;
            }

            if(curr == null) break;
        }
        list.display(head);
    }
}
