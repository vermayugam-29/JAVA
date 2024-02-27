import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node list = new Node();
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            list.add(data);
        }
        sorted(list.head);
    }
    static void sorted(Node head){
        Node temp = head;
        while (temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
            }
            else temp = temp.next;
        }
        head.display(head);
    }
}
