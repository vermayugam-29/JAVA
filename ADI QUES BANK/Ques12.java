import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        solve(s+" ");
    }
    static void  solve(String s){
        String a = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >=65 && s.charAt(i) <= 90){ //upper case
                sum = sum + ((s.charAt(i) - 'A') + 1);
            }
            else if(s.charAt(i) >=97 && s.charAt(i) <= 122){ //lower case
                sum = sum - ((s.charAt(i) - 'a') + 1);
            }
            else{
                if(sum < 0) a += 0;
                else if(sum > 9) a +=0;
                else a += sum;
                sum = 0;
            }
        }
        System.out.println(a);
    }
}
