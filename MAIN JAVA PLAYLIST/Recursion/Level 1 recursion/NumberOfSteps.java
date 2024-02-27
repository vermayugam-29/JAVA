//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class NumberOfSteps {
    public static void main(String[] args) {
        int n = 14;
        int cnt = 0;

        System.out.println(countSteps(n,cnt));
    }
    static int countSteps(int n,int cnt){
        //base condition
        if(n == 0){
            return cnt;
        }

        if(n%2 == 0){
            return countSteps(n/2,cnt+1);
            
        }

        return countSteps(n-1,cnt+1);
    }
}
