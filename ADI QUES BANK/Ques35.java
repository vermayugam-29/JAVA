import java.util.Arrays;
import java.util.Scanner;

public class Ques35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int[] arr = new int[n+1];
        System.out.println(Arrays.toString(solve(arr,n)));
    }
    static int[] solve(int[] arr,int n){
        for(int i=0;i<=n;i++){
            arr[i] = countBit(i);
        }
        return arr;
    }
    static int countBit(int i){
        String bit = Integer.toBinaryString(i);
        int count = 0;
        for(char ch : bit.toCharArray()){
            if(ch == '1') count++;
        }
        return count;
    }
}
