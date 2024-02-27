import java.util.Scanner;

public class FindSingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = SingleElement(arr, n);
        System.out.println(ans);
    }
    public static int SingleElement(int[] arr,int n){
        //0 1 2 3 4 5 6 7 8 9 10
        //1 1 2 2 3 3 4 5 5 6 6 
        int start = 1;
        int end = arr.length-2;
        if(arr.length == 1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        else if(arr[n-1] != arr[n-2]) return arr[n-1];
        else{
            while (start <= end) {
                int mid = start + (end-start)/2;
                if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) return arr[mid];
                else if((mid%2 == 1 && arr[mid] == arr[mid-1]) ||(arr[mid] == arr[mid+1] && mid%2 == 0)){ //mid%2==1 means if you are at odd index 
                    //meaning we are on left half and element is on right half 
                    start = mid+1; // eliminating the left half
                }
                // else if(arr[mid] == arr[mid+1] && mid%2 != 0){
                //     end = mid-1;
                // }
                else {
                    end = mid-1;
                }
            }
            return -1;
        }
    }
}