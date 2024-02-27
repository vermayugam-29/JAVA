import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String S = sc.nextLine();
       int n = S.length();


       // code for pattern printing of strings-----------------------------------------------------------------------
       for(int i=0;i<S.length();i++){ //loop1 for next lines 
        for (int j = 0; j < S.length() - i; j++) {
            // System.out.print(S.charAt(j));          
        }
        // System.out.println();
       }

    //code  for  triangle pattern shrinking --------------------------------------------------------------------------
    String str = "";
    for(int i=0;i<n;i++){//loop used for adding next line and printing characters
        for(int j=0;j<i;j++){
            str = str + ".";
            System.out.println(".");
        }
        str = str + S.substring(i , n);
    }
    System.out.print(str);
    }
}
