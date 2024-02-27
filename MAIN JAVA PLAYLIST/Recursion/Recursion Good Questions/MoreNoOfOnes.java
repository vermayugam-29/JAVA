import java.util.ArrayList;
import java.util.List;

//https://www.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1
public class MoreNoOfOnes {
    public static void main(String[] args) {
        int n = 1;

        print("",0,0,2);
    }
    static void print(String p,int one,int zero,int n){
        if(n == 0){
            System.out.println(p);
            return;
        }

        print(p+"1",one +1,zero,n-1);
        //zero तभी add करेंगे जब हमारे पास no of 1's > no of 0's
        //add zero only when no of 1's in current string p are > no of 0's because we need to have more or == 1's
        if(zero < one) print(p+"0",one,zero+1,n-1);
    }
}
