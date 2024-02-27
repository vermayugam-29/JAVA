import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = Binary( n);
        System.out.println(ans);
    }
    public static int Binary(int target){
        int start = 1;
        int end = target;
        while(start <= end){
            int mid = start + (end - start)/2;
            int c = mid;
            if(c*c <= target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return end;
    }
}