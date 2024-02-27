import java.util.Scanner;

public class PrintAllSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //print using three loops
        // i is used as starting index from where we have to print
        // j is used as ending index to  where we have to print
        //k is used to print all elements bw i and j

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }

                System.out.println();//next line  after printing every sub array
            }
        }
    }
}
