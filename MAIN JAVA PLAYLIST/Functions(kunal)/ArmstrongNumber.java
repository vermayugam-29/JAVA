import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int temp = n;
        int rem = 0;
        int sum = 0;
        while(n>0){
            rem = n%10;
            sum = sum +(rem*rem*rem);
            n = n/10;
        }
        if(temp == sum){
            System.out.println("Armstrong");
        }
        else System.out.println("not");
    }
}
