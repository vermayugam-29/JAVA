import java.util.Scanner;

public class CutWoods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(BinarySearch(arr,target));

    }
    public static int BinarySearch(int[] arr,int target){
        int end = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > end){
                end = arr[i];
            }
        }

        int start = 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            int a = check(arr,mid);

            if(a >= target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return end;

    }
    public static int check(int[] arr,int mid){
        int diff = 0;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            diff = arr[i] - mid;
            if(diff <= 0){
                diff = 0;
            }

            sum += diff;
        }
        return sum;
    }

}
