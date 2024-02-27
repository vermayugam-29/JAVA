import java.util.Arrays;
import java.util.Scanner;

public class Kmultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 12;//sc.nextInt();
        int k = 5;//sc.nextInt();
        //output:- 12,24,36,48,60
        int[] arr = new int[k];

        tableOfnum(arr,1,num,k);
        System.out.println(Arrays.toString(arr));
    }
    static void tableOfnum(int[] arr,int idx,int num,int k){
        if(idx > k) return;
        arr[idx-1] = num * idx;
        tableOfnum(arr,idx+1,num,k);
    }
}
