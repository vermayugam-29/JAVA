import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ques38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(solve(str1,str2));

    }
    static boolean solve(String str1,String str2){
        String arr[] = str2.split(" ");
        //edge case
        if(str1.length() != arr.length) return false;

        Map<Character,String> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(str1.charAt(i))){
                if(!map.get(str1.charAt(i)).equals(arr[i])){
                    return false;
                }
            }
            else if(map.containsValue(arr[i])){
                return false;
            }
            else{
                map.put(str1.charAt(i),arr[i]);
            }
        }
        return true;
    }
}
