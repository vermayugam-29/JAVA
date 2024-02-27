import java.util.Scanner;

public class Ques46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.next();

        System.out.println(solve(str1,str2));
    }
    static int solve(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i+1; j <=str1.length(); j++) {
                if(str1.substring(i,j).equals(str2)) return i;
            }
        }
        return -1;
    }
}
