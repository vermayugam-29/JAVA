import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(span(arr)));
    }
    static int[] span(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Pair> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] >= stack.peek().element){
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? i+1 : i - (stack.peek().index);
            stack.push(new Pair(arr[i],i));
        }

        return ans;
    }
}
class Pair {
    int element;
    int index;
    public Pair (int ele,int i){
        this.element = ele;
        this.index = i;
    }
}
