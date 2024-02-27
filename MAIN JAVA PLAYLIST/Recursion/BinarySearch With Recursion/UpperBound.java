import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        System.out.println(Binary(arr,target,0,n-1));
    }
    static int Binary(int[] arr,int target,int start,int end){
        if(start > end){
            return start;
        }
        int mid = start + (end-start)/2;

        if(target >= arr[mid]){
            return Binary(arr,target,mid+1,end);
        }
        return Binary(arr,target,start,mid-1);
    }
}
