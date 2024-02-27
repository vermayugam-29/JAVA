import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = solve(nsr(arr),nsl(arr),arr);
        System.out.println(ans);
    }
    static int solve(int[] nsr,int[] nsl,int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0;i < arr.length; i++){
            int area = arr[i]*(nsr[i] - nsl[i] - 1);
            max = Math.max(area,max);
        }
        return max;
    }
    static int[] nsl(int[] arr){
        int[] nsl = new int[arr.length];
        Stack<Pair> stack = new Stack<>();

        for(int i=0;i<nsl.length;i++){
            while (!stack.isEmpty() && arr[i] <= stack.peek().element){
                stack.pop();
            }

            nsl[i] = stack.isEmpty() ? -1 : stack.peek().index;
            stack.push(new Pair(arr[i],i));
        }
        return nsl;
    }
    static int[] nsr(int[] arr){
        int[] nsr = new int[arr.length];
        Stack<Pair> stack = new Stack<>();

        for(int i = arr.length-1;i>= 0;i--){
            while (!stack.isEmpty() && arr[i] <= stack.peek().element){
                stack.pop();
            }
            nsr[i] = stack.isEmpty() ? arr.length : stack.peek().index;
            stack.push(new Pair(arr[i],i));
        }
        return nsr;
    }
}
