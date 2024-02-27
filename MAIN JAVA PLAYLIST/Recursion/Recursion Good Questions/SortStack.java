import java.util.Scanner;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        sort(stack);
        while (!stack.isEmpty()){
            System.out.print(stack.pop() +" ");
        }
    }
    static void sort(Stack<Integer> stack){
        if(stack.size() == 1){
            return;
        }

        int temp = stack.pop();
        sort(stack);
        insert(stack,temp);
    }
    static void insert(Stack<Integer> stack , int temp){
        if(stack.isEmpty() || stack.peek() <= temp){
            stack.push(temp);
            return;
        }

        int val = stack.pop();
        insert(stack,temp);
        stack.push(val);
    }
}
