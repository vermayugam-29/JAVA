import java.util.Scanner;

public class SpanOfArray {

    public static int Minval(int[] arr){
        int rv = Integer.MAX_VALUE;
        for (int i : arr) {
            if(i<rv){
                rv = i;
            }
        }
        return rv;
    }

    public static int Maxval(int[] arr){
        int rv = Integer.MIN_VALUE;
        for(int element : arr){
            if(element>rv){
                rv = element;
            }
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int a = Maxval(arr);
        int b = Minval(arr);
        System.out.println(a-b);
    }
}