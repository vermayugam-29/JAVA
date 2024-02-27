import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String a ="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                a+=Character.toLowerCase(str.charAt(i));
            }
            else{
                a+=Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(a);
    }
}
