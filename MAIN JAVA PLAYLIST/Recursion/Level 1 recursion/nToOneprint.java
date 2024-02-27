import java.util.Scanner;

public class nToOneprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        ReversePrint(5);
    }
    static void ReversePrint(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        
        //recursive call
        ReversePrint(n-1);
    }
}
