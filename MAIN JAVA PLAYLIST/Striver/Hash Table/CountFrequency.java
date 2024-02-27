import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new  int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[100000000]; //10^8
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q = sc.nextInt();//no of test case 
        while (q != 0) {
            int number = sc.nextInt();
            System.out.print(hash[number] + " ");
            q--;
        }
    }
}
