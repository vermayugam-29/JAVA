import java.util.*;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        int maxSum = sc.nextInt();

        while(n-- > 0){
            first.push(sc.nextInt());
        }
        while(m-- > 0){
            second.push(sc.nextInt());
        }

        solve(first,second,0,0,maxSum);
        System.out.println(maxSteps);

    }
    static int maxSteps = Integer.MIN_VALUE;
    static void solve(Stack<Integer> one,Stack<Integer> two,int sum,int cnt,int max){
        if(sum > max){
            maxSteps = Math.max(maxSteps,cnt);
            return;
        }
        if(!one.isEmpty()) solve(one,two,sum+one.pop(),cnt+1,max);
        if(!two.isEmpty()) solve(one,two,sum+two.pop(),cnt+1,max);
    }
}
