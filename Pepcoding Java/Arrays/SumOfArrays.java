import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr = new int[n1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int max = 0;
        if(n1 > n2) max = n1;
        else max = n2;
        int[] sum = new int[max];
        
        int i = arr.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;
        int c = 0;
        int d = 0;

        while (k>=0){
            d = c;


            if(i>=0){
                d = d + arr[i];
            }
            if(j>=0){
                d = d + arr2[j];
            }
            c = d/10;
            d = d%10;

            sum[k] = d;
            
            i--;
            j--;
            k--;
        }
        if(c>0){
            System.out.print(c);
        }
        for (int a = 0; a < sum.length; a++) {
            System.out.print(sum[a]);
        }
    }
}
