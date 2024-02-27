import java.util.Scanner;

public class CircularLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CLL list = new CLL();

        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int data = sc.nextInt();
            list.addFirst(data);
        }
        list.remove(10);
        list.display();
    }
}
class CLL {
    int size;
    CLL head,tail;
    public CLL(){
        this.size = 0;
    }

    CLL next;
    int value;
    public CLL(int val){
        this.value = val;
    }
    public CLL(int val,CLL next){
        this.value = val;
        this.next = next;
    }

    //INSERTING
    public void addFirst(int val){
        CLL node = new CLL(val);
        if (head == null){
            head = node;
            tail = node;
            tail.next = head;
            return;
        }
        node.next = head;
        head = node;
        if(tail == null) tail = head;
        tail.next = head;

        size++;
    }
    //DISPLAY FUNCTION
    public void display () {
        CLL temp = head;

        while (temp != tail){
            System.out.print(temp.value +" --> ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }
    //REMOVE FUNCTION
    public void remove (int index){
        CLL temp = getIdx(index);

        temp.next = temp.next.next;
        size--;
    }
    public CLL getIdx(int index) {
        CLL temp = head;
        for (int i=0;i<index-1;i++){
            temp = temp.next;
        }
        return temp;
    }
}
