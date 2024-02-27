import java.util.LinkedList;
import java.util.Queue;

public class QueueSyntax {
    public static void main(String[] args) {
        //queue syntax
        Queue<Integer> queue = new LinkedList<>();

        //adding elements in queue
        queue.add(23);
        queue.add(43);
        queue.add(69);

        //getting first element
        System.out.println(queue.peek());

        //removing  first element
        queue.poll();//first element removed
        queue.remove();//works same as poll
        System.out.println(queue);
    }
}
