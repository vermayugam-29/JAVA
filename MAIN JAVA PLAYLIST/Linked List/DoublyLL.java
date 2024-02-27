import java.util.*;

public class DoublyLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DLL list = new DLL();
        for (int i = 0 ; i < n ; i++){
            int data = sc.nextInt();
            list.addFirst(data);
        }
        list.addNode(1,3);
        list.display();
    }
}
class DLL {
    DLL head,tail;
    int size;
    public DLL(){
        this.size = 0;
    }

    int value;
    DLL next,prev;
    public DLL(int val){
        this.value = val;
    }
    public DLL(DLL next, DLL prev, int val){
        this.value = val;
        this.next = next;
        this.prev = prev;
    }
    //INSERTING AT FRONT
    public void addFirst(int val){
        DLL node = new DLL(val);

        node.next = head;
        node.prev = null;

        if (head != null){ //TO AVOID NullPointerException when we are adding elements for very first time
            head.prev = node;
        }
        if(tail == null) tail = head;
        head = node;

        size+=1;
    }
    //INSERTING AT LAST
    public void addLast(int val){
//        ListNode node = new ListNode(val);
//
//        ListNode temp = tail;
//        temp.next = node;
//        node.prev = temp;
//        node.next = null;
//
//        tail = node;
//
//        size++;

        DLL node = new DLL(val);
        DLL temp = head;
        node.next = null;
        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while(temp.next != null) temp = temp.next;

        temp.next = node;
        node.prev = temp;

        tail = node;

        size++;
    }
    //INSERTING IN BETWEEN
    public void addNode(int val,int node){
        DLL newNode = new DLL(val);

        DLL temp = head;

        while (temp.value != node){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        newNode.prev = temp;
        if (newNode.next != null) newNode.next.prev = newNode;

        size++;
    }
    //DISPLAY FUNCTION
    public void display() {
        System.out.println("This is in Normal order print :-");
        DLL temp = head;

        while (temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    //REVERSE DISPLAY
    public void displayRev () {
        System.out.println("This is in Reverse order print :-");
        DLL temp = tail;
        while (tail != null){
            System.out.print(tail.value + " <-- ");
            tail = tail.prev;
        }
        System.out.println("START");
    }

    public void add(int data) {
    }
}
