import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextSmallerRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nextSmaller(arr)));
    }
    static int[] nextSmaller(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=arr.length-1;i>=0 ;i--){
            while (!stack.isEmpty() && arr[i] <= stack.peek()){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return ans;
    }
}
