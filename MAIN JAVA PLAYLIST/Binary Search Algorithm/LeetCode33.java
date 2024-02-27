import java.util.Scanner;

public class LeetCode33 {  // Search element in rotated arry ques on leet code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int max = PivotElement(arr);
        // System.out.println(max);
        if(max == -1) System.out.println(BinarySearch(arr, target, 0, n-1));
        else if(arr[max] == target) System.out.println(max);
        else if(target >=arr[0]) System.out.println(BinarySearch(arr, target, 0, max-1));
        //we have searched from 0-(max-1) because all numbers after
        //max are smaller  than start say the array is [4,5,6,7,0,1,2] and the target is 6 so  we will 
        //search till max-1 because it is rotated so all elements after that are  smaller so will search before 
        //max

        else System.out.println(BinarySearch(arr, target, max+1, n-1));
        
    }
    static int PivotElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])  return mid;
            else if(start<mid && arr[mid]<arr[mid-1]) return mid-1;
            else if(arr[mid]<=arr[start]) end = mid - 1;
            else start = mid +1;
        }
        return -1;

    }
    //code for finding pivot when we have duplicate values in array-------------------------------------------------
    static int findPivotwithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid-1]>arr[mid]) return mid-1;
            else if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //eg when array is 2,2,9,2,2,2 here 2 that is mid is equal to end ans start
                //so  skip these start and end
                start++;
                //there might be a case  when start is actually greater then its next element in that case
                //return start eg 2,2,9,2,2 here 9 is mid and is greater then 2 so return 9
                if(arr[start]>arr[start+1]) return start;
                //similarly there might be a case when end is smaller than previous element eg 2,2,9,2 so return end-1
                else if(arr[end]<arr[end-1]) return end-1;
                end--;
            }
            //if like 2,2,3,9,2 here mid=3,start=2 so we know pivot element will be in right side of array
            //so we started searching in rigt=ht by doing start=mid+1
            //or if 2,2,2,9,1 mid=2,start=2and end=1
            if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid +1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    static int BinarySearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
}
