import java.util.Scanner;

public class SortOrRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // boolean check = false;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(arr[arr.length - 1] > arr[0]){
            count++;
        }
        if(count<=1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
}
