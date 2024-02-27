import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        int j =1;
        int i =0;
        while(j<arr.length) {
            if(arr[i]==0 && arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
            else if(arr[i]!=0 && arr[j]!=0){
                i++;
                j++;
            }
            else if(arr[i]!=0 && arr[j]==0){
                i++;
                j++;
            }
            else if(arr[i] == 0 && arr[j] == 0){
                j++;
            }
        }


        i = 0;
        while(i < arr.length){
        System.out.print(arr[i] + " ");
        i++;
        }
    }


}
