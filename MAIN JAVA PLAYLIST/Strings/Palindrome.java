import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean isPalindrome = UsingWhile(name);
        boolean checkPalindrome = UsingForLoop(name);
        System.out.println(isPalindrome);
        System.out.println(checkPalindrome);
    }
    public static boolean UsingWhile(String name){
        int n = name.length();
        int start = 0,end = n-1;
        if(name == null || n==0) return true;
        while(start <= end){
            if(name.charAt(start) != name.charAt(end)) return false;
            start++;end--;
        }
        return true;
    }
    public static boolean UsingForLoop(String name){
        name = name.toLowerCase();
        int n = name.length();
        if(name == null || n==0) return true;
        for (int i = 0; i < n/2; i++) {
            if(name.charAt(i) != name.charAt(n-1-i)) return false;
        }
        return true;
    }
}
