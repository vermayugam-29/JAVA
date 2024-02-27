import java.util.Scanner;

public class isArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number which needed to be checked:");
        int num = sc.nextInt();
        boolean isArray = false;
        for (int element : arr) {
            if(num == element){
                isArray = true;
                break;
            }
        }
        if(isArray){
            System.out.println("The number is present");
        }
        else{
            System.out.println("The number is not present");
        } 
    }
}
