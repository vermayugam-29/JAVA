import java.util.Scanner;

public class Ques32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int amount = sc.nextInt();

        System.out.println(solve(arr,0,amount));
    }
    static int solve(int[] arr,int index,int amount){
        if(index == arr.length){
            if(amount == 0) return 1;
            else return 0;
        }

        //including current index
        int include = 0;
        if(amount >= arr[index]) include = solve(arr,index,amount-arr[index]);

        //excluding element at curr index and incrementing the index
        int exclude = solve(arr,index+1,amount);

        return include+exclude;
    }
}
