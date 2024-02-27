import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        removeFunction(s);
    }
    public static void removeFunction(String str){
        char[] arr = str.toCharArray();
        String a = "" + arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]){
                a += arr[i];
            }
        }
        System.out.println(a);
    }
}
