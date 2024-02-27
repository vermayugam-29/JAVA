import java.util.Arrays;
import java.util.Scanner;

public class SortArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = sc.nextInt();
        }
        boolean checks = SortOrNot(arr);
        while(checks == false){
            int i = 0;
            int j = 1;
            while(j<arr.length){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
                j++;
            }
        }     
        System.out.println(Arrays.toString(arr));
        
    }
    public static boolean SortOrNot(int[] arr){
        boolean check = false;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1]<arr[i]){
                check = true;
            }
            else{
                check = false;
                break;
            }
        }
        return check;
    }
}
