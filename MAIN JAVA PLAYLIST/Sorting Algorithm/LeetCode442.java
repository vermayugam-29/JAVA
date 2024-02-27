import java.util.*;
import java.util.Scanner;

public class LeetCode442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        duplicate(arr, list);
        System.out.println(list);
    }
    static void duplicate(int[] arr,List<Integer> list){
        Cycle(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                list.add(arr[i]);
            }
        }
    }
    static void Cycle(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;//correct inedex check
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
