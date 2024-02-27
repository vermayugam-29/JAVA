import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueSyntax {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque<>();//pronounced as deck

        //adding elements

        deck.add(34);

        deck.addFirst(23); //add from first
        deck.addLast(45); //add from last

        //removing elements

        deck.removeFirst();
        deck.removeLast();
    }
}
