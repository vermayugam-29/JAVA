import java.util.Stack;

public class ImplementQueueUsingStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();


    //constructor
    public ImplementQueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    //adding element in 1st stack
    public void push(int element){
        stack1.push(element);
    }
    //getting removed element
    public int pop(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());//adding elements from stack 1 to 2
        }

        int removedElement = stack2.pop();//removed item

        //moving remaining items back to stack1
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return removedElement;
    }
    public int peek(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());//adding elements from stack 1 to 2
        }

        int peekedElement = stack2.peek();//getting top item

        //moving remaining items back to stack1
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return peekedElement;
    }
    //checking if stack is Empty
    public boolean Empty(){
        return stack1.isEmpty();
    }
}
