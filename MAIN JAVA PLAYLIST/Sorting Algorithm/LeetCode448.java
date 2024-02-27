import java.util.*;
import java.util.Scanner;

public class LeetCode448 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        Cycle(arr, list);
        System.out.println(list);
    }
    static void Cycle(int[] arr,ArrayList<Integer> list){
        int i=0;
        while(i<arr.length){
            int correct= arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                list.add(j+1);
            }
        }
        
    }
    
}
