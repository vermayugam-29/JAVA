import java.util.Scanner;

public class DigitFrequency {

    public static int DigitCount(int x,int n){
        int rem = 0;
        int k = 0; //k = digit count
        while(x > 0){
            rem = x % 10;
            if(rem==n){
                k = k+1;
            }
            x = x/10;
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // a = input number 
        int n = sc.nextInt(); //n = digit which is to be checked
        int result = DigitCount(a, n);
        System.out.println(result);

    }
}