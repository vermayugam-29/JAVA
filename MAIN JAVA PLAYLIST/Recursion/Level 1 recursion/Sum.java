public class Sum {
    public static void main(String[] args) {
        System.out.println(Sum1ToN(2));
    }
    static int Sum1ToN(int n){
        if(n <= 1){
            return n;
        }

        return n + Sum1ToN(n-1);
    }
}
