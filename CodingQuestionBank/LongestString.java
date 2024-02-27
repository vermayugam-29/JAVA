import java.util.*;
public class LongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int ans = largest(a);
        System.out.println(ans);
    }
    public static int largest(String str){
        String[] arr = str.split(" ");
        int max = arr[0].length();

        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i].length()){
                max = arr[i].length();
            }
        }
        return max;
    }
}
