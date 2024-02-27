import java.util.*;

public class PalindromicLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int data = sc.nextInt();

        while(data != -1){
            data = sc.nextInt();
            if(data  != -1) list.add(-1);
        }

        String ans = isPalindrome(list) ? "YES" : "NOT PALINDROME";
        System.out.println(ans);
    }
    static boolean isPalindrome(List<Integer> list){
        int i = 0;
        int j = list.size()-1;
        while(i < j){
            if(list.get(i) != list.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
