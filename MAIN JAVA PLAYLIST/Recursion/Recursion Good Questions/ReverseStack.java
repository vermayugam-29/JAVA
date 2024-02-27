import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        reverse(stack);
        System.out.println(stack);
    }
    static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }

        int temp = stack.pop();
        reverse(stack);
        helper(stack,temp);
    }
    static void helper(Stack<Integer> stack,int temp){
        if(stack.isEmpty()){
            stack.push(temp);
            return;
        }

        int val = stack.pop();
        helper(stack,temp);
        stack.push(val);
    }
}
