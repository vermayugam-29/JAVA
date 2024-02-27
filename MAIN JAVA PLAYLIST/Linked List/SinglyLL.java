import java.util.*;

public class SinglyLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        NodeLL list = new NodeLL();

        for (int i = 0;i<n;i++){
            int data = sc.nextInt();
            list.addFirst(data);
        }
        list.display();
    }
}
class NodeLL {
    NodeLL head;
    NodeLL tail;
    int size;
    public NodeLL(){
        this.size = 0;
    }

    public void display(){
        NodeLL temp = head;
        while (temp != null){
            System.out.print(temp.value +" ->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    NodeLL next;
    int value;
    public NodeLL(int val){
        this.value = val;
    }
    public NodeLL(NodeLL next, int val){
        this.next = next;
        this.value = val;
    }

    //INSERTING IN LL
    public void addFirst(int val){
        NodeLL node = new NodeLL(val);
        node.next = head;
        head = node;

        if(tail == null) tail = head;
        size += 1;
    }
    //INSERTING ELEMENT AT LAST
    public void addLast(int val){
        if(tail == null){//means list is empty
            addFirst(val);
            return;
        }
        NodeLL node = new NodeLL(val);
        tail.next = node;
        tail = node;
        size += 1;
    }
    //INSERTING AT A PARTICULAR INDEX
    public void addIndex(int index,int val){
        if(index == 0) {
            addFirst(val);
            return;
        }
        if(index == size){
            addLast(val);
            return;
        }

        NodeLL temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        NodeLL node = new NodeLL(temp.next,val);
        temp.next = node;
        size += 1;
    }
    //DELETING FIRST INDEX
    public int removeFirst(){
        int value = head.value;
        head = head.next;
        if(head == null) tail = null;
        size -= 1;
        return value;
    }
    //DELETING LAST INDEX
    public int removeLast(){
        if(size <= 1) return removeFirst();

        NodeLL secondLast = getIdx(size-2);
        int val = tail.value;
        tail = secondLast; //now tail is secondLast
        tail.next = null ; //setting last value as null
        size -= 1;

        return val;
    }
    //GETTING NODE VALUE FUNCTION
    public NodeLL getIdx(int idx){
        NodeLL newNode = head;
        for(int i=0;i<idx;i++){
            newNode = newNode.next;
        }
        return newNode;
    }
    //REMOVE FROM A PARTICULAR INDEX
    public int remove(int index){
        if(index == 0) return removeFirst();
        else if(index == size-1) return removeLast();
        else if(index >= size) return -1;

        NodeLL prev = getIdx(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }
    //GETTING NODE
    public NodeLL get(int val){
        NodeLL node = head;
        while (node != null){
            if(node.value == val) return node;
            //Otherwise just move the node
            node = node.next;
        }
        return null;
    }
}