import java.util.*;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;//sc.nextInt();

        generate("",n,n);
    }
    static void generate(String out,int open,int close){
        if(close == 0 && open == 0){
            System.out.println(out);
            return;
        }

        if(open != 0) generate(out + "(",open - 1,close);
        if(close > open) generate(out+")",open,close -1);
    }
}
