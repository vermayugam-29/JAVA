import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(isValid(str));
    }
    static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            //if open brackets
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            //if close brackets
            else{
                if(ch == ')'){
                    //check if curr element at top of stack is open bracket of same type or not
                    if(stack.isEmpty() || stack.pop() != ')') return false;
                }
                if(ch == ']'){
                    //check if curr element at top of stack is open bracket of same type or not
                    if(stack.isEmpty() || stack.pop() != '[') return false;
                }
                if(ch == '}'){
                    //check if curr element at top of stack is open bracket of same type or not
                    if(stack.isEmpty() || stack.pop() != '{') return false;
                }
            }
        }

        //if all conditions pass then check if stack is empty or not
        return stack.isEmpty();
    }
}
