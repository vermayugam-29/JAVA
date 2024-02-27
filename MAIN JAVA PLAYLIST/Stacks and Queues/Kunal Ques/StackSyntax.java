import java.util.Stack;

public class StackSyntax {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //for adding elements in a stack
        stack.push(23);
        stack.push(67);
        stack.push(45);

        //for removing top elements
        stack.pop();

        //for getting top element of stack : stack.peek();
        System.out.println(stack.peek());
    }
}
