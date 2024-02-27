import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //pre computing
        int[] hash = new int[26];//for lower case or uppercase not for special take size=256 for all chars
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a'] ++;//for upper case do -'A'
        }

        //taking test case inputs
        int k = sc.nextInt();
        while(k != 0){
            char ch = sc.next().charAt(0);
            System.out.print(hash[ch - 'a']);
            k--;
        }
    }
}
