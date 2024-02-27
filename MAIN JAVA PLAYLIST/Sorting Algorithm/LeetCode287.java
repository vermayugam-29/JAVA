import java.util.Scanner;

public class LeetCode287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(duplicate(arr));
    }
    static void Cycle(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end] = temp;
    }
    static int duplicate(int[] arr){
        Cycle(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                ans = arr[i]; 
            }
        }
        return ans;
    }
}
