import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String paragragh = sc.nextLine();
        String word = sc.next();

        System.out.println(solve(paragragh,word));
    }
    static int solve(String para,String word){
        //base case
        if(para.isEmpty()) return 0;

        if(para.startsWith(word)){
            return 1 + solve(para.substring(1),word);
        }
        else{
            return solve(para.substring(1),word);
        }
    }
}
