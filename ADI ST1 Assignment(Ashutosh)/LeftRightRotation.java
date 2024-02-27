import java.util.Scanner;

public class LeftRightRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int d = sc.nextInt();

//        System.out.println(rotation(s,d));
        rotation(s,d);
    }
    public static void rotation(String s,int d){
        int n = s.length();
        String left = s.substring(d,n) + s.substring(0,d);
        System.out.println(left);
        String right = s.substring(n-d,n) + s.substring(0,n-d);
        System.out.println(right);
    }
}
