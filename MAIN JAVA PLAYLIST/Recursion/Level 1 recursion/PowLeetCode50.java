public class PowLeetCode50 {
    public static void main(String[] args) {
        double n = 1.00000;
        int x = 1000;
        double ans = power(n,n,1,x);
        System.out.println(ans);
    }
    static double power(double x,double n,int pow,int maxPow){
        if(pow == maxPow){
            return n;
        }

        return power(x,x*n,pow+1,maxPow);
    }
}
