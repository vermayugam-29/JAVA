import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test_case = sc.nextInt();

        while (test_case-- > 0){
            String s = sc.next();
            if(s.equals("es")) System.out.println("Yes");
            else if(check(s)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
    static boolean check(String s){
        if(s.isEmpty()) return false;

        if(s.startsWith("Yes")) return true;
        if(s.startsWith("esY")) return true;
        if(s.startsWith("sYes")) return true;

        return check(s.substring(1));
    }
}
