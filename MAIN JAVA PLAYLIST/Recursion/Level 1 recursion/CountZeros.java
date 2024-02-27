public class CountZeros {
    public static void main(String[] args) {
        int n = 34; //output :- 3
        Count(n);
        System.out.println(count);

        //method 2----
        int cnt = 0;
        System.out.println(zero(n,cnt));
    }
    static int count = 0;
    static void Count(int n){
        if(n <= 0){
            return;
        }
        int rem = n%10;
        if(rem == 0){
            count++;
        }
        Count(n/10);
    }

    //method 2
    static int zero(int n,int cnt){
        //base condition
        if(n == 0){
            //returning count when base condition hits
            return cnt;
        }
        //incrementing count based on condition
        if(n%10 == 0){
            cnt++;
        }

        return zero(n/10,cnt);
    }
}
