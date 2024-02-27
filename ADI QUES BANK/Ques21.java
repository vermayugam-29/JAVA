import java.util.Scanner;

public class Ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = sc.nextInt();
        int high = sc.nextInt();

        System.out.println(solve(low,high));;
    }
    static int solve(int low,int high){
        int count = 0;
        for(int i=low;i<=high;i++){
            String a = String.valueOf(i);
            if(a.length()%2 == 0){
                int half = a.length()/2;
                int left = findSum(a.substring(0,half));
                int right = findSum(a.substring(half));

                if(left == right){
                    count++;
                }
            }
        }
        return count;
    }

    static int findSum(String a) {
        int sum = 0;
        for(int i=0;i<a.length();i++){
            sum += (a.charAt(i) - '0');
        }
        return sum;
    }
}
