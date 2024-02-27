import java.util.*;

public class Largestnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//----------------METHOD 1-------------------------

        // if(a>b && a>c){
        //     System.out.print(a + " is greatest of three");
        // }
        // else if(b>a && b>c){
        //     System.out.print(b + "is greatest of three");
        // }
        // else if(c>a && c>b){
        //     System.out.print(c + "is greatest of three");
        // }
        // else{
        //     System.out.println("invalid number");
        // }

//----------------METHOD 2-------------------

        // int max = a;
        // if(b>max){
        //     max = b;
        // }
        // if(c>max){
        //     max = c;
        // }
        // System.out.print(max);


//--------------METHOD 3---------------

        int max = Math.max(c,Math.max(a,b));
        System.out.print(max);
    }
}