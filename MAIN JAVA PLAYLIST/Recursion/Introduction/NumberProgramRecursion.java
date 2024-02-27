import java.util.Scanner;

public class NumberProgramRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //from where to start printing
        int m = sc.nextInt(); // where to end printing

        print(n, m);
    }
    static void print(int n , int m){
        if(n == m){ //this is the base condition where program will end
            System.out.println(n);
            return;
        }
        System.out.println(n);


        //recursive call
        print(n+1,m);
    }
}
