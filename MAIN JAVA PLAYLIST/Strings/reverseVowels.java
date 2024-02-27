import java.util.Scanner;

public class reverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String ans = Reversed(name);

        System.out.println(ans);
    }
    public static String Reversed(String str){
        char[] ch = str.toCharArray();
        String vowel = "";
        int j = 0;
        for (int i = 0; i < ch.length; i++) {
            if(isVowel(ch[i])){
                vowel = vowel + ch[i];
                j++;
            }
        }

        for (int i = 0; i < ch.length; i++) {
            if(isVowel(ch[i])){
                j--;
                ch[i] = vowel.charAt(j);
            }
        }

        return String.valueOf(ch);
    } 
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || 
        ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}
