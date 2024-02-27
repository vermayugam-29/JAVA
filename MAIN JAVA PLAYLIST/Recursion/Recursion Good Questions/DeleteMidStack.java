import java.util.*;

public class DeleteMidStack {
    public static void main(String[] chutad) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        int k = stack.size() % 2 == 0 ? (stack.size()/2) - 1 : (stack.size()/2);
        solve(stack,k);
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
    static void solve(Stack<Integer> stack,int k){
        if(k == 0){
            stack.pop();
            return;
        }

        int temp = stack.pop();
        solve(stack,k-1);
        stack.push(temp);
    }
}
