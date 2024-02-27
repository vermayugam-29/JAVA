import java.util.Scanner;

public class ArmstrongFunction {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int  n = sc.nextInt();
        // boolean ans = ArmOrNot(n);
        // System.out.println(ans); 
        for(int i =100 ;i <= 999; i++){
            if(ArmOrNot(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean ArmOrNot(int n){
        int rem = 0;
        int temp = n;
        int sum = 0;
        while(n>0){
            rem = n%10;
            sum = sum +(rem*rem*rem);
            n = n/10;
        }
        return temp==sum;
    }
}
