import java.util.Scanner;

public class OrderAgnostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(OrderAgnosticBinSearch(arr, target));
    }
    public static int OrderAgnosticBinSearch(int[] arr , int k){
        int start = 0;
        int end = arr.length-1;
        boolean isAscending = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(k == arr[mid]){
                return mid;
            }
            // else if(arr[start] < arr[end]) //this gives tle in leet code 
            
            else if(isAscending){
                if(k < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start= mid +1;
                }
            }
            else{
                if(k < arr[mid]){
                    start = mid +1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
