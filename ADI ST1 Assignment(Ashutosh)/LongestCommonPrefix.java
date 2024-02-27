import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] str) {
        if(str.length == 1){
            return str[0];
        }

        String prefix = str[0];

        for(int i=1;i<str.length;i++){
            while(!str[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
