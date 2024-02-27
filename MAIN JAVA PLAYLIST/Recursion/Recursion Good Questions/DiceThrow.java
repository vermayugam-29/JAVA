import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceThrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int target = 500;//sc.nextInt();
        dice("",target);


        int n = 1;//no of dice
        int k = 6;//no of faces
        diceFaces("",target,k,n);

    }
    static int count = 0;
    //code for dice with 6 faces
    static void dice(String output,int n){
        if(n == 0){
            System.out.println(output);
            return;
        }

        for (int i = 1; i <=6 && i <= n; i++) {
            dice(output + i,n - i);
        }
    }
    //code for n dices with custom no of faces
    static void diceFaces(String output,int target,int faces,int n){
        if(target == 0){
            if(output.length() == n) System.out.println(output);
            return;
        }

        for(int i=1;i<=faces && i<=target;i++){
            diceFaces(output+i,target-i,faces,n);
        }
    }
}
