import java.util.*;
public class QuadraticProbing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[5];

        for(int i=0;i<n;i++){
            int mod = arr[i] % 5;
            if(hash[mod] == 0){
                hash[mod] = arr[i];
            }

            else{//----------------------------------------------
                while(true){
                    mod = (mod + 1) % 5;
                    if(hash[mod] == 0){
                        hash[mod] = arr[i];
                        break;
                    }
                }
            }//---------------------------------------------------
        }
        for(int i : hash){
            if(i != 0) System.out.print(i +" ");
        }
    }
}