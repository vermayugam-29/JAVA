import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        System.out.println(traffic(n, m, arr));
    }
    public static int traffic(int n, int m, int []vehicle) {
        // Write your code here.
        int count = 0;
        for(int i=0;i<vehicle.length;i++){
            if(count == m){
                break;
            }
            else if(vehicle[i] == 0){
                vehicle[i] = 1;
                count++;
            }
        }
        int max = 0;
        for(int i=0;i<vehicle.length;i++){
            if(vehicle[i] == 1){
                max++;
            }
            else{
                break;
            }
        }

        return max;
    }
}
