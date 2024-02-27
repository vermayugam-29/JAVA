public class ReverseNumber {
    public static void main(String[] args) {
        reverse(1);
        System.out.println(sum);
        //method 2
        int n = 4;
        String a = String.valueOf(n);
        int pow = a.length();

        System.out.println(way2(n,pow));
    }
    //method 2----------------------------------------------------------
    static int way2(int n,int power){
        if(n <= 0){
            return 0;
        }

        return (n%10)*(int)Math.pow(10,power-1) + way2(n/10,power-1);
    }

    //method 1------------------------------------------------------------
    static int sum = 0;
    static void reverse(int n){
        if(n <= 0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;

        reverse(n/10);
    }
}
