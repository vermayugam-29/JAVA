import java.util.Scanner;

public class RotateList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node list = new Node();

        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            list.add(data);
        }
        rotate(list.head,list,2000000000);
    }
    static void rotate(Node head,Node list,int k){
        while(k > 0){
            Node temp1 = head;

            while(temp1.next != null && temp1.next.next != null){
                temp1 = temp1.next;
            }
            Node temp2 = temp1.next;
            temp1.next = null;
            temp2.next = head;
            head = temp2;
            k--;
        }
        list.display(head);
    }
}
