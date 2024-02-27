import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int slargest = secondLargest(arr,n);
        int ssmalest = secondSmallest(arr,n);
        System.out.println(slargest +" " + ssmalest);
    }
    public static int secondLargest(int[] arr,int n){
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }

            else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
    public static int secondSmallest(int[] arr,int n){
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<smallest){
                ssmallest= smallest;
                smallest = arr[i];
            }

            else if(arr[i]>smallest && arr[i]<ssmallest){
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
}









//brute force method----------------------------------------------------------------------
/*Arrays.sort(arr);
int largest = arr[n-1];
int smallest = arr[0];
for (int i = n-2; i >=0; i--) {
    if(arr[i] != largest){
        ans[0] = arr[i];
        break;
    }
}
for (int i = 1; i < arr.length; i++) {
    if(arr[i] != smallest){
        ans[1] = arr[i];
        break;
    }
}
System.out.println(Arrays.toString(ans));*/