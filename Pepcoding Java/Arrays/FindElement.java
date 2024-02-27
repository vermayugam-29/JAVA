import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int r = -1; // r = index we have set -1 beacuse there will be a case when the element we need 
                    //to find in array will not be present so that time it will give value -1
        int nc = sc.nextInt(); //nc =number that needs to be checked
        for (int i = 0; i< arr.length;i++) {
            if(nc==arr[i]){
                r = i;
                break;
            }
        }
        System.out.println(r);
    }
}
