import java.util.*;

public class stringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        String[] str = new String[3];
        
        for (int i = 0; i < str.length ; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
