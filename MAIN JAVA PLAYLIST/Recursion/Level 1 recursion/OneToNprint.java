import java.util.Scanner;

public class OneToNprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 1;//sc.nextInt(); //start
        int n = 5;//sc.nextInt(); //end

//        Print(m,n);
        printNewMethod(n);
    }
    public static void printNewMethod(int n){
        if(n == 0){
            return;
        }

        //recursive call
        printNewMethod(n-1);
        System.out.println(n);

    }
    static void Print(int m,int n){
        if(m == n){
            System.out.println(m);
            return;
        }

        System.out.println(m);

        //recursive call
        Print(m+1, n);
    }
}
