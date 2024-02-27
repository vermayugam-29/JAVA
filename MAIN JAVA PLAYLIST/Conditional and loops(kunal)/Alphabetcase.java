import java.util.*;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Alphabetcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(2);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }

    }
}
