public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(recSum(12345));
    }
    static int recSum(int n){
        if( n <= 0){
            return 0;
        }

        return n%10 + recSum(n/10);
    }
}
