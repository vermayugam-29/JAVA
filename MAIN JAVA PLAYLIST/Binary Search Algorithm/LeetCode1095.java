import java.util.Scanner;

public class LeetCode1095 { //Find element in mountain array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int ans = search(arr, target);
        System.out.println(ans);
    }
    public static int search(int[] arr,int target){
        int peak = PeakElement(arr);
        int firstSearch = BinarySearch(arr, 0, peak, target);
        int secondSearch = BinarySearch(arr, peak+1, arr.length-1, target);
        if(firstSearch != -1){
            return firstSearch;
        }
        return secondSearch;
    }
    public static int PeakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            // if(arr[mid]<arr[mid+1]){
            //     start = mid+1;
            // }
            // else if(arr[mid]>arr[mid+1]){ ///this was  giving error in leet code so use the below instead
            //     end=mid;
            // }
             if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    public static int BinarySearch(int[] arr,int start,int end,int k){
        boolean isAscending = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;
            if(k == arr[mid]){
                return mid;
            }
            // else if(arr[start] < arr[end]) //this gives tle in leet code so use this

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