import java.util.Scanner;

public class NthSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = Binary(n, m);
        System.out.println(ans);
    }
    //My method ------------------------------------------------------------------------------
    public static int Binary(int n,int target){
        int start = 1;
        int end = target;

        while(start <= end){
            int mid = start + (end-start)/2;
            int key = (int) Math.pow(mid,n);
            if(key < target){
                start = mid +1;
            }
            else if(key > target){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    //Striver's method------------------------------------------------------------------------
    public  static int BinaryStriver(int n,int target){
        int start = 1;
        int end = target;

        while(start <= end){
            int mid = start + (end-start)/2;
            int power = findmidToPowerN(mid, n, target);
            if(power == 2){
                end = mid - 1;
            }
            else if(power == 0){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    //Striver's Method------------------------------------------------------------------------------
    public static int findmidToPowerN(int mid,int n,int target){
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans = ans * mid;

            if(ans > target) {//agar ans bada ho jata ha target to 2 return karado matlab 
                //hum karenge end = mid -1 .meaning right side will be eliminated and we will search left
                return 2;
            }
        }
        if(ans < target) return 0;
        return 1;
    }
}
