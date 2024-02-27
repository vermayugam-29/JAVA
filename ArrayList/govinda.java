import java.util.Scanner;

class govinda{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // if(n == 4 || n == 22 || n == 27 || n == 58 || n == 85 || n == 94 || n == 147 || n == 483 || n == 647){
        //     System.out.println(1);
        // }
        // else{
        //     System.out.println(0);
        // }
        String str1 = sc.nextLine();
        StringBuilder resultant = new StringBuilder(str1);
        System.out.println(resultant.reverse());
    }
}