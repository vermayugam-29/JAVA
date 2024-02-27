import java.util.Scanner;

public class minimun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //for minimum element-------------------------------------------------

        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if(element<min){
                min = element;
            }
        }
        System.out.println(min);

        // for maxmimun element----------------------------------------------------
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if(element>max){
                max = element;
            }
        }
        System.out.println(max);
    }
}
