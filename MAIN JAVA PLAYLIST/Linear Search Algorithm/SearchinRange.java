import java.util.Scanner;

public class SearchinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = -1;
        int  k = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(start<0 || end >= arr.length){
            System.out.println("Pease give valid searching range");
        } 
        else{
            for (int i = start; i <= end; i++) {
                if(arr[i] == k){
                    ans = i;
                }
            }
            System.out.println("Element is found at index: "+ans);
        }
        
    }
}
