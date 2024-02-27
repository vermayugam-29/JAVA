import java.util.*;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        

        int  n = str.length();
        int count=1;
        String a = "" + str.charAt(0);

        for (int i = 1; i < n; i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev){
                count++;
            }

            else{
                if(count>1) a += count;
                count = 1;//reseting count
                a += curr;
            }
        }
        if(count>1) a+= count;
        System.out.println(a);
        
    }
}
